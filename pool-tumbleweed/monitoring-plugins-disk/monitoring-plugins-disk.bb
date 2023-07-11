SUMMARY = "Check disk space"
DESCRIPTION = "This plugin checks the amount of used disk space on a mounted file system and \
generates an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-disk-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "e25d73bfb814fa91f592b040f6ee21c4c3917b188569bdab6341150893ecf6d8c58e9139128bdce2ff631a7413d16877734cc539a15c1c5d0e82cb7ef8672897"

RPROVIDES:${PN} += "config-monitoring-plugins-disk \
monitoring-plugins-disk \
nagios-plugins-disk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

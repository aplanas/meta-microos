SUMMARY = "Libraries for Nagios plugins"
DESCRIPTION = "This package includes the libraries (scripts) that are included by many \
of the standard checks."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-common-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "679726a0e6983b57f042112eb4d0d907b09a58841cd46295e6b3b1880c5a80829a948618bde02f70a30e78825238ac05a3c57478d33f220b231e8fbe30b50a70"

RPROVIDES:${PN} += "config-monitoring-plugins-common \
monitoring-plugins-common \
nagios-plugins-common \
perl-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

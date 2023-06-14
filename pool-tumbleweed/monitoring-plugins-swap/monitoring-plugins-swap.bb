SUMMARY = "Check swap space"
DESCRIPTION = "Check swap space on local machine."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-swap-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "257df4741f835028ac263a8b43ce6cdab606b28e995359a878ce1182f9249f802003dbc53c72f2ff9cf4035ac21498425de57185bb5263e316ce54e9c3832571"

RPROVIDES:${PN} += "config-monitoring-plugins-swap \
monitoring-plugins-swap \
nagios-plugins-swap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

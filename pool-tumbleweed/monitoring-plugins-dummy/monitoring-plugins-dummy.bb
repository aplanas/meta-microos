SUMMARY = "Dummy check"
DESCRIPTION = "This plugin will simply return the state corresponding to the numeric value of \
the <state> argument with optional text."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dummy-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "7cc5820b3b345ee1d2f181da9d145e18057740dcfe58cecc51388c2183e627816ae6a96acf9d59e638567e29904af96c9034343fc200b27defd69fdc5eb82209"

RPROVIDES:${PN} += "monitoring-plugins-dummy \
nagios-plugins-dummy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

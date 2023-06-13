SUMMARY = "Check the age/size of files"
DESCRIPTION = "This plugin will check either the age of files or their size."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-file_age-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "a181fe42b4f5a55399f1572235eecc49dde480ecafe8dc301fed762f24a6bdd44f85c75e8d0939007f466fe8328c53433a57524a408e331c7deb5279f96f32c6"

RPROVIDES:${PN} += "monitoring-plugins-file_age \
monitoring-plugins-file_age(aarch-64) \
nagios-plugins-file_age"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm

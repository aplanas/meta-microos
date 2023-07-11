SUMMARY = "Check the age/size of files"
DESCRIPTION = "This plugin will check either the age of files or their size."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-file_age-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "9deb461dd5355610c9393b834a8d4ac9268bc363e2eb846c9e3c403fd6a87e6c26ec6e831e516f74508dc7b4664b1b19dcd9691869619f2afdbb51eb900aaee7"

RPROVIDES:${PN} += "monitoring-plugins-file-age \
nagios-plugins-file-age"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm

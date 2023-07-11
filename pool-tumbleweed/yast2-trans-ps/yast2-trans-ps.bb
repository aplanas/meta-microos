SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ps-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "78429522c163fb04514dff6029c9bcff397d61dd5ff605d0621f8b9196a3b3ce9da889814cc327202162f8b8322c23858fbec488eda1e574786155ecf67e14f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm

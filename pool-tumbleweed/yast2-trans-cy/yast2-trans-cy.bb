SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-cy-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "358e689823262cf01a56e09de9cf123af3db2b36bcce3ad2b84a5d960641be548bdf0594283ed8f382e3939ba50f948c13dabbb1bd51dc54097ed2eee6303004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm

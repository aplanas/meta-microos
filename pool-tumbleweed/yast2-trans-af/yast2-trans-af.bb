SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-af-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "ee205f68ff0ae15f165c14f394a19275969d5bbabbc62b6d8bd11fae0ce7289f6ecb66884b0ddb31467b0819c5fc9eb12c303e44299d518ae30a2e70c23ab043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sq-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "406d01c26e4af0d499ffd50919b996dfcee29f9d27780573a6a107f52b9f13ac277619452e313294b8ca2dd259dcf9eacbdafc483f93b53a2fd7624c1573a8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-eu-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "5d9ed3d8aa6fd1470055001281dd9ceae2afafac6baf9e5b524570baa243134548155351342c05aa0857b42739dc693fe4867acb2458fe2290ebdcd21d52fae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm

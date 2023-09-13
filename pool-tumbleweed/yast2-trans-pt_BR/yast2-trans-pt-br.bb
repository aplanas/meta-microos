SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "7f4f2fcd307763673d1bd9fdbb057199458cfd011fe198c9ca50e21e5477f7492d8eb99f499caffb2bf6092e75d8d638e204463113b8b4a7e018300424b7c938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm

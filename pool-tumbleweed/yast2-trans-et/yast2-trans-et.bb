SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-et-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "f2d13b93829ab80545e954572507592f238d71b89f4a9798f526f2f63eea91e0a2e04c3a960ae959392b0266a3d809c4c8b0f2991bdf88bf6ab927b06c71e8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm

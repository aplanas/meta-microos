SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-lo-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "343a57300a3827ffaadd92947b16c1eec85b17c2e3f5056bc83c7478d2922b4ce7f5bd55e2081882c2ea6b533ced4a01b48141224c95d7c375140018ba353328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm

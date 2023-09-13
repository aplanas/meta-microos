SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-bg-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "714ada12d5cf9f0cc3e5a8ced2d704a0f662d63510b8895d5b9b9a2b2a0a8666f224af574a45bd386f5fa29275a5a939296bbda1e7a7d38b307cbccb914a5180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Translations for package sakura"
DESCRIPTION = "Provides translations for the 'sakura' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.7"

RPM_NAME = "sakura-lang-3.8.7-1.1.noarch.rpm"
RPM_HASH = "a84c41a6d3d4635c18b4e19ff78de1efe975ecff05aa418fcd2eb1f18f1e29ac731d44ee506cd844211cb616b3d5f73c299a76726fe4ff62e03e22885ad99db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sakura-ca \
locale-sakura-cs \
locale-sakura-de \
locale-sakura-en-GB \
locale-sakura-es \
locale-sakura-fr \
locale-sakura-he \
locale-sakura-hr \
locale-sakura-hu \
locale-sakura-it \
locale-sakura-ja \
locale-sakura-ko \
locale-sakura-pl \
locale-sakura-pt \
locale-sakura-pt-BR \
locale-sakura-ru \
locale-sakura-sv \
locale-sakura-tr \
locale-sakura-uk \
locale-sakura-zh-CN \
sakura-lang \
sakura-lang-all"

RDEPENDS:${PN} += "sakura"

inherit rpm

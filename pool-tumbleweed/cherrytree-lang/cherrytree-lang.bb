SUMMARY = "Translations for package cherrytree"
DESCRIPTION = "Provides translations for the 'cherrytree' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.0.0"

RPM_NAME = "cherrytree-lang-1.0.0-1.1.noarch.rpm"
RPM_HASH = "4598d585040f061dadbe11dc5d8d98bab928d4f812b9a7c32b2647296733f3466a0ba089b829e7d5b59289e362a10c66a5c646c2f880b9b358b92e40643af586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cherrytree-lang \
cherrytree-lang-all \
locale-cherrytree-ar \
locale-cherrytree-bg \
locale-cherrytree-cs \
locale-cherrytree-de \
locale-cherrytree-el \
locale-cherrytree-es \
locale-cherrytree-fa \
locale-cherrytree-fi \
locale-cherrytree-fr \
locale-cherrytree-hr \
locale-cherrytree-hu \
locale-cherrytree-it \
locale-cherrytree-ja \
locale-cherrytree-ko \
locale-cherrytree-lt \
locale-cherrytree-nl \
locale-cherrytree-pl \
locale-cherrytree-pt \
locale-cherrytree-pt-BR \
locale-cherrytree-ro \
locale-cherrytree-ru \
locale-cherrytree-sl \
locale-cherrytree-sv \
locale-cherrytree-tr \
locale-cherrytree-uk \
locale-cherrytree-zh-CN \
locale-cherrytree-zh-TW"

RDEPENDS:${PN} += "cherrytree"

inherit rpm

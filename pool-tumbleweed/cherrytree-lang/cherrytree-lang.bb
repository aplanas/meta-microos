SUMMARY = "Translations for package cherrytree"
DESCRIPTION = "Provides translations for the 'cherrytree' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "0.99.55"

RPM_NAME = "cherrytree-lang-0.99.55-1.4.noarch.rpm"
RPM_HASH = "1d0c5668d55ca4c49fa1b4c01414c340513c6d075b92210d08e84bdc7cea27fc4b4654eeb794e7d67465e1b43b214cc1f6146d1d21662b2bb17ee379dd23c090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cherrytree-lang \
cherrytree-lang-all \
locale-cherrytree-ar \
locale-cherrytree-bg \
locale-cherrytree-cs \
locale-cherrytree-de \
locale-cherrytree-el \
locale-cherrytree-es \
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

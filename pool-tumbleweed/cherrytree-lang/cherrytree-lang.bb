SUMMARY = "Translations for package cherrytree"
DESCRIPTION = "Provides translations for the 'cherrytree' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.0.1"

RPM_NAME = "cherrytree-lang-1.0.1-1.1.noarch.rpm"
RPM_HASH = "941c736b2d5b2e41b598902b5cec4dca6a04423d0da68c2029ea19910c4ec0e003d219e27613dde7fc8173093167da13c973be7c301d307a7e279997c642617f"
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

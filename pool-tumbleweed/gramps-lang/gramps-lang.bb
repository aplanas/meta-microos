SUMMARY = "Translations for package gramps"
DESCRIPTION = "Provides translations for the 'gramps' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "gramps-lang-5.1.6-1.1.noarch.rpm"
RPM_HASH = "cdaa76cacf55c486855b3be582cbb8ac6ff015beb6862ff67ef0c08f5e21c89422157d5683b9a855d14a581d2dab31f3fceb4d5ed0ecb1789d0ef01fbfe772f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gramps-lang \
gramps-lang-all \
locale-gramps-ar \
locale-gramps-bg \
locale-gramps-ca \
locale-gramps-cs \
locale-gramps-da \
locale-gramps-de \
locale-gramps-el \
locale-gramps-en-GB \
locale-gramps-eo \
locale-gramps-es \
locale-gramps-fi \
locale-gramps-fr \
locale-gramps-he \
locale-gramps-hr \
locale-gramps-hu \
locale-gramps-is \
locale-gramps-it \
locale-gramps-ja \
locale-gramps-lt \
locale-gramps-nb \
locale-gramps-nl \
locale-gramps-nn \
locale-gramps-pl \
locale-gramps-pt-BR \
locale-gramps-pt-PT \
locale-gramps-ru \
locale-gramps-sk \
locale-gramps-sl \
locale-gramps-sq \
locale-gramps-sr \
locale-gramps-sv \
locale-gramps-ta \
locale-gramps-tr \
locale-gramps-uk \
locale-gramps-vi \
locale-gramps-zh-CN \
locale-gramps-zh-HK \
locale-gramps-zh-TW"

RDEPENDS:${PN} += "gramps"

inherit rpm

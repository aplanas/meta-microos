SUMMARY = "Translations for package icewm"
DESCRIPTION = "Provides translations for the 'icewm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.0"

RPM_NAME = "icewm-lang-3.4.0-1.1.noarch.rpm"
RPM_HASH = "f3de990dbb576818588e330194a98f04c7de9430f2357a8fd756300b6522dbed0778d6a085cf5c5b7af5248486c99ae805d9ad4f1250607f5dfe0bbb2ca640fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-lang \
icewm-lang-all \
locale-icewm-ar \
locale-icewm-be \
locale-icewm-bg \
locale-icewm-ca \
locale-icewm-cs \
locale-icewm-da \
locale-icewm-de \
locale-icewm-el \
locale-icewm-en \
locale-icewm-es \
locale-icewm-fi \
locale-icewm-fr \
locale-icewm-he \
locale-icewm-hr \
locale-icewm-hu \
locale-icewm-id \
locale-icewm-it \
locale-icewm-ja \
locale-icewm-ko \
locale-icewm-lt \
locale-icewm-lv \
locale-icewm-mk \
locale-icewm-nb \
locale-icewm-nl \
locale-icewm-pl \
locale-icewm-pt \
locale-icewm-pt-BR \
locale-icewm-ro \
locale-icewm-ru \
locale-icewm-sk \
locale-icewm-sl \
locale-icewm-sv \
locale-icewm-tr \
locale-icewm-uk \
locale-icewm-vi \
locale-icewm-zh-CN \
locale-icewm-zh-TW"

RDEPENDS:${PN} += "icewm"

inherit rpm

SUMMARY = "Translations for package dolphin-emu"
DESCRIPTION = "Provides translations for the 'dolphin-emu' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-lang-5.0.17995-4.1.noarch.rpm"
RPM_HASH = "3801fa90f7c05d1800649fb41b508ad6bf1ff11dfebd4fc270bfd624ed54cd47b3715e679d406f24cd62e3d63a613322926e36fe8de8eafbcf148587f9228ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-emu-lang \
dolphin-emu-lang-all \
locale-dolphin-emu-ar \
locale-dolphin-emu-ca \
locale-dolphin-emu-cs \
locale-dolphin-emu-da \
locale-dolphin-emu-de \
locale-dolphin-emu-el \
locale-dolphin-emu-en \
locale-dolphin-emu-es \
locale-dolphin-emu-fa \
locale-dolphin-emu-fr \
locale-dolphin-emu-hr \
locale-dolphin-emu-hu \
locale-dolphin-emu-it \
locale-dolphin-emu-ja \
locale-dolphin-emu-ko \
locale-dolphin-emu-ms \
locale-dolphin-emu-nb \
locale-dolphin-emu-nl \
locale-dolphin-emu-pl \
locale-dolphin-emu-pt \
locale-dolphin-emu-pt-BR \
locale-dolphin-emu-ro \
locale-dolphin-emu-ru \
locale-dolphin-emu-sr \
locale-dolphin-emu-sv \
locale-dolphin-emu-tr \
locale-dolphin-emu-zh-CN \
locale-dolphin-emu-zh-TW"

RDEPENDS:${PN} += "dolphin-emu"

inherit rpm

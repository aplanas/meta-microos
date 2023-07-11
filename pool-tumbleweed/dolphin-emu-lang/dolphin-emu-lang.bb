SUMMARY = "Translations for package dolphin-emu"
DESCRIPTION = "Provides translations for the 'dolphin-emu' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-lang-5.0.17995-3.3.noarch.rpm"
RPM_HASH = "82ea7cc0b9a491a9d204083614b6957baae84facb829e027948a58dd07d75f0d96f9d00297e6251165e8d6ab63f709a52696708230701862e943c889e49055c2"
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

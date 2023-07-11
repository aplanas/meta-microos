SUMMARY = "Translations for package gnome-tweaks"
DESCRIPTION = "Provides translations for the 'gnome-tweaks' package."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "42.beta+60"

RPM_NAME = "gnome-tweaks-lang-42.beta+60-1.2.noarch.rpm"
RPM_HASH = "9c9abfe530cc601184a48e49a4f7c54f7d0a351f6de164f0d7b11a8296368a4573e396f010b3f17e8bb03d2d26cd32d75f619c8eb2c23124569db547a48d8517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tweaks-lang \
gnome-tweaks-lang-all \
locale-gnome-tweaks-af \
locale-gnome-tweaks-ar \
locale-gnome-tweaks-as \
locale-gnome-tweaks-be \
locale-gnome-tweaks-bg \
locale-gnome-tweaks-bs \
locale-gnome-tweaks-ca \
locale-gnome-tweaks-ca@valencia \
locale-gnome-tweaks-cs \
locale-gnome-tweaks-da \
locale-gnome-tweaks-de \
locale-gnome-tweaks-el \
locale-gnome-tweaks-en-GB \
locale-gnome-tweaks-eo \
locale-gnome-tweaks-es \
locale-gnome-tweaks-eu \
locale-gnome-tweaks-fa \
locale-gnome-tweaks-fi \
locale-gnome-tweaks-fr \
locale-gnome-tweaks-fur \
locale-gnome-tweaks-gl \
locale-gnome-tweaks-he \
locale-gnome-tweaks-hr \
locale-gnome-tweaks-hu \
locale-gnome-tweaks-id \
locale-gnome-tweaks-is \
locale-gnome-tweaks-it \
locale-gnome-tweaks-ja \
locale-gnome-tweaks-ka \
locale-gnome-tweaks-kk \
locale-gnome-tweaks-ko \
locale-gnome-tweaks-lt \
locale-gnome-tweaks-lv \
locale-gnome-tweaks-ml \
locale-gnome-tweaks-ms \
locale-gnome-tweaks-nb \
locale-gnome-tweaks-ne \
locale-gnome-tweaks-nl \
locale-gnome-tweaks-oc \
locale-gnome-tweaks-pa \
locale-gnome-tweaks-pl \
locale-gnome-tweaks-pt \
locale-gnome-tweaks-pt-BR \
locale-gnome-tweaks-ro \
locale-gnome-tweaks-ru \
locale-gnome-tweaks-sk \
locale-gnome-tweaks-sl \
locale-gnome-tweaks-sr \
locale-gnome-tweaks-sr@latin \
locale-gnome-tweaks-sv \
locale-gnome-tweaks-te \
locale-gnome-tweaks-th \
locale-gnome-tweaks-tr \
locale-gnome-tweaks-uk \
locale-gnome-tweaks-vi \
locale-gnome-tweaks-zh-CN \
locale-gnome-tweaks-zh-HK \
locale-gnome-tweaks-zh-TW"

RDEPENDS:${PN} += "gnome-tweaks"

inherit rpm

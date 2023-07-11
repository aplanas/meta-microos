SUMMARY = "Translations for package minicom"
DESCRIPTION = "Provides translations for the 'minicom' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-lang-2.8-1.6.noarch.rpm"
RPM_HASH = "d6dac7ba7a21f840ed598bd7b46b3cbdf6f8b5bf74b44570822ce0535324f0fa5714011077f974a0944b5d0524c850a8dfdb86ae324bfd5c66b9ae4cbf7fb507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minicom-cs \
locale-minicom-da \
locale-minicom-de \
locale-minicom-es \
locale-minicom-fi \
locale-minicom-fr \
locale-minicom-hu \
locale-minicom-id \
locale-minicom-ja \
locale-minicom-nb \
locale-minicom-pl \
locale-minicom-pt-BR \
locale-minicom-ro \
locale-minicom-ru \
locale-minicom-sr \
locale-minicom-sv \
locale-minicom-vi \
locale-minicom-zh-CN \
locale-minicom-zh-TW \
minicom-lang \
minicom-lang-all"

RDEPENDS:${PN} += "minicom"

inherit rpm

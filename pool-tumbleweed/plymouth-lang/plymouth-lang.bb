SUMMARY = "Translations for package plymouth"
DESCRIPTION = "Provides translations for the 'plymouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-lang-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "7402d5e901f06160bd0a3c99adc6a6c9fa219adb544962e2ae83087869578437b648f8e7507fc5ad77a1ac84142f81b0d9e49dab6bb4752a2c35b6f779247ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plymouth-be \
locale-plymouth-cs \
locale-plymouth-da \
locale-plymouth-de \
locale-plymouth-eo \
locale-plymouth-es \
locale-plymouth-eu \
locale-plymouth-fa \
locale-plymouth-fi \
locale-plymouth-fr \
locale-plymouth-fur \
locale-plymouth-he \
locale-plymouth-hr \
locale-plymouth-hu \
locale-plymouth-id \
locale-plymouth-it \
locale-plymouth-ka \
locale-plymouth-lt \
locale-plymouth-ms \
locale-plymouth-nl \
locale-plymouth-pa \
locale-plymouth-pl \
locale-plymouth-pt \
locale-plymouth-pt-BR \
locale-plymouth-ro \
locale-plymouth-ru \
locale-plymouth-si \
locale-plymouth-sk \
locale-plymouth-sr \
locale-plymouth-sv \
locale-plymouth-tr \
locale-plymouth-uk \
locale-plymouth-zh-CN \
locale-plymouth-zh-HK \
locale-plymouth-zh-TW \
plymouth-lang \
plymouth-lang-all"

RDEPENDS:${PN} += "plymouth"

inherit rpm

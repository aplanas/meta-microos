SUMMARY = "Translations for package plymouth"
DESCRIPTION = "Provides translations for the 'plymouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-lang-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "9fc596943ddeeb3d27bfb55faa848eb2d4737eb6a58b619ccda1422d930815e78ce117aa17038b3066615a2d0a8bf6be902719ca9f171f05016decb297ec3a42"
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

SUMMARY = "Translations for package plymouth"
DESCRIPTION = "Provides translations for the 'plymouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-lang-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "c3202a652cdbea5bac9414be318007425f506c2f2fd8cc532e6387efb617bb22c11459dbe51e50e50c3e854c92ba302b132d4e161e31fee3f6948a10ae1f43af"
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

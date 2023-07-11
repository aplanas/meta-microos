SUMMARY = "Translations for package simple-scan"
DESCRIPTION = "Provides translations for the 'simple-scan' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "simple-scan-lang-44.0-1.2.noarch.rpm"
RPM_HASH = "1e5c94652b57f4075f298f179ffe25947811387138dcb1e5fab91198983a49edf1c161aafa8f98c4c11a38455ee9529adf0b77b4dab1381455af3a95fbdde256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-simple-scan-af \
locale-simple-scan-ar \
locale-simple-scan-ast \
locale-simple-scan-az \
locale-simple-scan-be \
locale-simple-scan-bg \
locale-simple-scan-ca \
locale-simple-scan-ca@valencia \
locale-simple-scan-cs \
locale-simple-scan-da \
locale-simple-scan-de \
locale-simple-scan-el \
locale-simple-scan-en-GB \
locale-simple-scan-eo \
locale-simple-scan-es \
locale-simple-scan-et \
locale-simple-scan-eu \
locale-simple-scan-fa \
locale-simple-scan-fi \
locale-simple-scan-fr \
locale-simple-scan-fur \
locale-simple-scan-gd \
locale-simple-scan-gl \
locale-simple-scan-he \
locale-simple-scan-hr \
locale-simple-scan-hu \
locale-simple-scan-id \
locale-simple-scan-is \
locale-simple-scan-it \
locale-simple-scan-ja \
locale-simple-scan-ka \
locale-simple-scan-kk \
locale-simple-scan-km \
locale-simple-scan-ko \
locale-simple-scan-lt \
locale-simple-scan-lv \
locale-simple-scan-ml \
locale-simple-scan-ms \
locale-simple-scan-nb \
locale-simple-scan-ne \
locale-simple-scan-nl \
locale-simple-scan-oc \
locale-simple-scan-pa \
locale-simple-scan-pl \
locale-simple-scan-pt \
locale-simple-scan-pt-BR \
locale-simple-scan-ro \
locale-simple-scan-ru \
locale-simple-scan-sk \
locale-simple-scan-sl \
locale-simple-scan-sq \
locale-simple-scan-sr \
locale-simple-scan-sr@latin \
locale-simple-scan-sv \
locale-simple-scan-ta \
locale-simple-scan-te \
locale-simple-scan-th \
locale-simple-scan-tr \
locale-simple-scan-ug \
locale-simple-scan-uk \
locale-simple-scan-vi \
locale-simple-scan-zh-CN \
locale-simple-scan-zh-HK \
locale-simple-scan-zh-TW \
simple-scan-lang \
simple-scan-lang-all"

RDEPENDS:${PN} += "simple-scan"

inherit rpm

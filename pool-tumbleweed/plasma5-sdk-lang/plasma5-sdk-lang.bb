SUMMARY = "Translations for package plasma5-sdk"
DESCRIPTION = "Provides translations for the 'plasma5-sdk' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "5.27.7.1"

RPM_NAME = "plasma5-sdk-lang-5.27.7.1-1.1.noarch.rpm"
RPM_HASH = "40e2d47ed96cde692760dcd36b834b30db6ad85cf7b891851507461ca221db1edd9bad977fbe4741bdb2cbcfb01525a08e6759c45936e209ec24868e87b3a8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-sdk-ar \
locale-plasma5-sdk-az \
locale-plasma5-sdk-be \
locale-plasma5-sdk-be@latin \
locale-plasma5-sdk-bg \
locale-plasma5-sdk-bn-IN \
locale-plasma5-sdk-bs \
locale-plasma5-sdk-ca \
locale-plasma5-sdk-ca@valencia \
locale-plasma5-sdk-cs \
locale-plasma5-sdk-da \
locale-plasma5-sdk-de \
locale-plasma5-sdk-el \
locale-plasma5-sdk-en-GB \
locale-plasma5-sdk-eo \
locale-plasma5-sdk-es \
locale-plasma5-sdk-et \
locale-plasma5-sdk-eu \
locale-plasma5-sdk-fa \
locale-plasma5-sdk-fi \
locale-plasma5-sdk-fr \
locale-plasma5-sdk-ga \
locale-plasma5-sdk-gl \
locale-plasma5-sdk-gu \
locale-plasma5-sdk-he \
locale-plasma5-sdk-hi \
locale-plasma5-sdk-hr \
locale-plasma5-sdk-hu \
locale-plasma5-sdk-ia \
locale-plasma5-sdk-id \
locale-plasma5-sdk-is \
locale-plasma5-sdk-it \
locale-plasma5-sdk-ja \
locale-plasma5-sdk-ka \
locale-plasma5-sdk-kk \
locale-plasma5-sdk-km \
locale-plasma5-sdk-kn \
locale-plasma5-sdk-ko \
locale-plasma5-sdk-lt \
locale-plasma5-sdk-lv \
locale-plasma5-sdk-mai \
locale-plasma5-sdk-mk \
locale-plasma5-sdk-ml \
locale-plasma5-sdk-mr \
locale-plasma5-sdk-ms \
locale-plasma5-sdk-nb \
locale-plasma5-sdk-nds \
locale-plasma5-sdk-ne \
locale-plasma5-sdk-nl \
locale-plasma5-sdk-nn \
locale-plasma5-sdk-oc \
locale-plasma5-sdk-or \
locale-plasma5-sdk-pa \
locale-plasma5-sdk-pl \
locale-plasma5-sdk-pt \
locale-plasma5-sdk-pt-BR \
locale-plasma5-sdk-ro \
locale-plasma5-sdk-ru \
locale-plasma5-sdk-si \
locale-plasma5-sdk-sk \
locale-plasma5-sdk-sl \
locale-plasma5-sdk-sq \
locale-plasma5-sdk-sr \
locale-plasma5-sdk-sr@ijekavian \
locale-plasma5-sdk-sr@ijekavianlatin \
locale-plasma5-sdk-sr@latin \
locale-plasma5-sdk-sv \
locale-plasma5-sdk-ta \
locale-plasma5-sdk-te \
locale-plasma5-sdk-th \
locale-plasma5-sdk-tr \
locale-plasma5-sdk-ug \
locale-plasma5-sdk-uk \
locale-plasma5-sdk-wa \
locale-plasma5-sdk-zh-CN \
locale-plasma5-sdk-zh-TW \
plasma5-sdk-lang \
plasma5-sdk-lang-all"

RDEPENDS:${PN} += "plasma5-sdk"

inherit rpm

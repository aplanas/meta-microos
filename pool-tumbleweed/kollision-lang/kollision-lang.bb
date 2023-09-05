SUMMARY = "Translations for package kollision"
DESCRIPTION = "Provides translations for the 'kollision' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kollision-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "d4a00aba47bda992b8d1eaf0c46c5e73b4d678315aba732726fc1fe31dbb2b8911d9ddeac0848c5aaeafce6f5b84717a798a9232f1e7e343e1bb8b04573f5155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kollision-lang \
kollision-lang-all \
locale-kollision-ar \
locale-kollision-bg \
locale-kollision-bs \
locale-kollision-ca \
locale-kollision-ca@valencia \
locale-kollision-cs \
locale-kollision-da \
locale-kollision-de \
locale-kollision-el \
locale-kollision-en-GB \
locale-kollision-eo \
locale-kollision-es \
locale-kollision-et \
locale-kollision-eu \
locale-kollision-fi \
locale-kollision-fr \
locale-kollision-ga \
locale-kollision-gl \
locale-kollision-gu \
locale-kollision-hr \
locale-kollision-hu \
locale-kollision-id \
locale-kollision-is \
locale-kollision-it \
locale-kollision-ja \
locale-kollision-ka \
locale-kollision-kk \
locale-kollision-km \
locale-kollision-ko \
locale-kollision-lt \
locale-kollision-lv \
locale-kollision-mai \
locale-kollision-ml \
locale-kollision-mr \
locale-kollision-nb \
locale-kollision-nds \
locale-kollision-nl \
locale-kollision-nn \
locale-kollision-pa \
locale-kollision-pl \
locale-kollision-pt \
locale-kollision-pt-BR \
locale-kollision-ro \
locale-kollision-ru \
locale-kollision-sk \
locale-kollision-sl \
locale-kollision-sq \
locale-kollision-sr \
locale-kollision-sr@ijekavian \
locale-kollision-sr@ijekavianlatin \
locale-kollision-sr@latin \
locale-kollision-sv \
locale-kollision-th \
locale-kollision-tr \
locale-kollision-ug \
locale-kollision-uk \
locale-kollision-zh-CN \
locale-kollision-zh-TW"

RDEPENDS:${PN} += "kollision"

inherit rpm

SUMMARY = "Translations for package kmousetool"
DESCRIPTION = "Provides translations for the 'kmousetool' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmousetool-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "23d256b046edff421b1d2327c48a105f2cb53b2cc81d961fa901576390d93f89aa1e958c96f81a4e6cc9cabf283050ad282f063523ad7d884bf1f99024653cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmousetool-lang \
kmousetool-lang-all \
locale-kmousetool-ar \
locale-kmousetool-be \
locale-kmousetool-bg \
locale-kmousetool-br \
locale-kmousetool-bs \
locale-kmousetool-ca \
locale-kmousetool-ca@valencia \
locale-kmousetool-cs \
locale-kmousetool-cy \
locale-kmousetool-da \
locale-kmousetool-de \
locale-kmousetool-el \
locale-kmousetool-en-GB \
locale-kmousetool-eo \
locale-kmousetool-es \
locale-kmousetool-et \
locale-kmousetool-eu \
locale-kmousetool-fa \
locale-kmousetool-fi \
locale-kmousetool-fr \
locale-kmousetool-ga \
locale-kmousetool-gl \
locale-kmousetool-he \
locale-kmousetool-hi \
locale-kmousetool-hr \
locale-kmousetool-hu \
locale-kmousetool-ia \
locale-kmousetool-is \
locale-kmousetool-it \
locale-kmousetool-ja \
locale-kmousetool-ka \
locale-kmousetool-kk \
locale-kmousetool-km \
locale-kmousetool-ko \
locale-kmousetool-lt \
locale-kmousetool-lv \
locale-kmousetool-mk \
locale-kmousetool-ml \
locale-kmousetool-mr \
locale-kmousetool-ms \
locale-kmousetool-nb \
locale-kmousetool-nds \
locale-kmousetool-ne \
locale-kmousetool-nl \
locale-kmousetool-nn \
locale-kmousetool-oc \
locale-kmousetool-pa \
locale-kmousetool-pl \
locale-kmousetool-pt \
locale-kmousetool-pt-BR \
locale-kmousetool-ro \
locale-kmousetool-ru \
locale-kmousetool-sk \
locale-kmousetool-sl \
locale-kmousetool-sq \
locale-kmousetool-sr \
locale-kmousetool-sr@ijekavian \
locale-kmousetool-sr@ijekavianlatin \
locale-kmousetool-sr@latin \
locale-kmousetool-sv \
locale-kmousetool-ta \
locale-kmousetool-th \
locale-kmousetool-tr \
locale-kmousetool-ug \
locale-kmousetool-uk \
locale-kmousetool-vi \
locale-kmousetool-zh-CN \
locale-kmousetool-zh-TW"

RDEPENDS:${PN} += "kmousetool"

inherit rpm

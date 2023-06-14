SUMMARY = "Translations for package kwin5"
DESCRIPTION = "Provides translations for the 'kwin5' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "kwin5-lang-5.27.5-2.2.noarch.rpm"
RPM_HASH = "14b938e94be877b51fe8b58263dd3ac36cb1d9d01ed0851ce920bd60dc23badbb27aab58ac5d6187f9af2a423820e22131c0fda32fdcceca23a01f6fd1a514a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwin5-lang \
kwin5-lang-all \
locale-kwin5-af \
locale-kwin5-ar \
locale-kwin5-as \
locale-kwin5-ast \
locale-kwin5-az \
locale-kwin5-be \
locale-kwin5-be@latin \
locale-kwin5-bg \
locale-kwin5-bn \
locale-kwin5-bn-IN \
locale-kwin5-br \
locale-kwin5-bs \
locale-kwin5-ca \
locale-kwin5-ca@valencia \
locale-kwin5-cs \
locale-kwin5-cy \
locale-kwin5-da \
locale-kwin5-de \
locale-kwin5-el \
locale-kwin5-en-GB \
locale-kwin5-eo \
locale-kwin5-es \
locale-kwin5-et \
locale-kwin5-eu \
locale-kwin5-fa \
locale-kwin5-fi \
locale-kwin5-fr \
locale-kwin5-ga \
locale-kwin5-gl \
locale-kwin5-gu \
locale-kwin5-he \
locale-kwin5-hi \
locale-kwin5-hr \
locale-kwin5-hu \
locale-kwin5-ia \
locale-kwin5-id \
locale-kwin5-is \
locale-kwin5-it \
locale-kwin5-ja \
locale-kwin5-ka \
locale-kwin5-kk \
locale-kwin5-km \
locale-kwin5-kn \
locale-kwin5-ko \
locale-kwin5-lt \
locale-kwin5-lv \
locale-kwin5-mai \
locale-kwin5-mk \
locale-kwin5-ml \
locale-kwin5-mr \
locale-kwin5-ms \
locale-kwin5-nb \
locale-kwin5-nds \
locale-kwin5-ne \
locale-kwin5-nl \
locale-kwin5-nn \
locale-kwin5-oc \
locale-kwin5-or \
locale-kwin5-pa \
locale-kwin5-pl \
locale-kwin5-pt \
locale-kwin5-pt-BR \
locale-kwin5-ro \
locale-kwin5-ru \
locale-kwin5-si \
locale-kwin5-sk \
locale-kwin5-sl \
locale-kwin5-sq \
locale-kwin5-sr \
locale-kwin5-sr@ijekavian \
locale-kwin5-sr@ijekavianlatin \
locale-kwin5-sr@latin \
locale-kwin5-sv \
locale-kwin5-ta \
locale-kwin5-te \
locale-kwin5-th \
locale-kwin5-tr \
locale-kwin5-ug \
locale-kwin5-uk \
locale-kwin5-vi \
locale-kwin5-wa \
locale-kwin5-zh-CN \
locale-kwin5-zh-TW"

RDEPENDS:${PN} += "kwin5"

inherit rpm

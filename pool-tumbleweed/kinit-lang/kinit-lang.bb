SUMMARY = "Translations for package kinit"
DESCRIPTION = "Provides translations for the 'kinit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kinit-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "ebbaaa9ad40d7e70b62e2200979aaa4259dcf1a670f56d29621b07d1a89f6e170d42515eb66c27ea98cec700932d2c9d9c298a754b971c882fa57ff1c77117d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kinit-lang \
kinit-lang-all \
locale-kinit-af \
locale-kinit-ar \
locale-kinit-as \
locale-kinit-az \
locale-kinit-be \
locale-kinit-be@latin \
locale-kinit-bg \
locale-kinit-bn \
locale-kinit-bn-IN \
locale-kinit-br \
locale-kinit-bs \
locale-kinit-ca \
locale-kinit-ca@valencia \
locale-kinit-cs \
locale-kinit-cy \
locale-kinit-da \
locale-kinit-de \
locale-kinit-el \
locale-kinit-en-GB \
locale-kinit-eo \
locale-kinit-es \
locale-kinit-et \
locale-kinit-eu \
locale-kinit-fa \
locale-kinit-fi \
locale-kinit-fr \
locale-kinit-ga \
locale-kinit-gd \
locale-kinit-gl \
locale-kinit-gu \
locale-kinit-he \
locale-kinit-hi \
locale-kinit-hr \
locale-kinit-hu \
locale-kinit-ia \
locale-kinit-id \
locale-kinit-is \
locale-kinit-it \
locale-kinit-ja \
locale-kinit-ka \
locale-kinit-kk \
locale-kinit-km \
locale-kinit-kn \
locale-kinit-ko \
locale-kinit-lt \
locale-kinit-lv \
locale-kinit-mai \
locale-kinit-mk \
locale-kinit-ml \
locale-kinit-mr \
locale-kinit-ms \
locale-kinit-nb \
locale-kinit-nds \
locale-kinit-ne \
locale-kinit-nl \
locale-kinit-nn \
locale-kinit-oc \
locale-kinit-or \
locale-kinit-pa \
locale-kinit-pl \
locale-kinit-pt \
locale-kinit-pt-BR \
locale-kinit-ro \
locale-kinit-ru \
locale-kinit-si \
locale-kinit-sk \
locale-kinit-sl \
locale-kinit-sq \
locale-kinit-sr \
locale-kinit-sr@ijekavian \
locale-kinit-sr@ijekavianlatin \
locale-kinit-sr@latin \
locale-kinit-sv \
locale-kinit-ta \
locale-kinit-te \
locale-kinit-th \
locale-kinit-tr \
locale-kinit-ug \
locale-kinit-uk \
locale-kinit-vi \
locale-kinit-wa \
locale-kinit-zh-CN \
locale-kinit-zh-HK \
locale-kinit-zh-TW"

RDEPENDS:${PN} += "kinit"

inherit rpm

SUMMARY = "Translations for package kdoctools"
DESCRIPTION = "Provides translations for the 'kdoctools' package."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.109.0"

RPM_NAME = "kdoctools-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "09218a519bd93c105ca94506ccd59e44474601f0e2079f0387e3d88bbbc165db4a981505110b29b8d20825c583c6cdfb04498121731c22bc4b1581eb529c6a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdoctools-lang \
kdoctools-lang-all \
locale-kdoctools-af \
locale-kdoctools-ar \
locale-kdoctools-az \
locale-kdoctools-be \
locale-kdoctools-bg \
locale-kdoctools-bn \
locale-kdoctools-br \
locale-kdoctools-bs \
locale-kdoctools-ca \
locale-kdoctools-ca@valencia \
locale-kdoctools-cs \
locale-kdoctools-cy \
locale-kdoctools-da \
locale-kdoctools-de \
locale-kdoctools-el \
locale-kdoctools-en-GB \
locale-kdoctools-eo \
locale-kdoctools-es \
locale-kdoctools-et \
locale-kdoctools-eu \
locale-kdoctools-fa \
locale-kdoctools-fi \
locale-kdoctools-fr \
locale-kdoctools-ga \
locale-kdoctools-gd \
locale-kdoctools-gl \
locale-kdoctools-gu \
locale-kdoctools-he \
locale-kdoctools-hi \
locale-kdoctools-hr \
locale-kdoctools-hu \
locale-kdoctools-ia \
locale-kdoctools-id \
locale-kdoctools-is \
locale-kdoctools-it \
locale-kdoctools-ja \
locale-kdoctools-ka \
locale-kdoctools-kk \
locale-kdoctools-km \
locale-kdoctools-kn \
locale-kdoctools-ko \
locale-kdoctools-lt \
locale-kdoctools-lv \
locale-kdoctools-mai \
locale-kdoctools-mk \
locale-kdoctools-ml \
locale-kdoctools-mr \
locale-kdoctools-ms \
locale-kdoctools-nb \
locale-kdoctools-nds \
locale-kdoctools-ne \
locale-kdoctools-nl \
locale-kdoctools-nn \
locale-kdoctools-oc \
locale-kdoctools-pa \
locale-kdoctools-pl \
locale-kdoctools-pt \
locale-kdoctools-pt-BR \
locale-kdoctools-ro \
locale-kdoctools-ru \
locale-kdoctools-sk \
locale-kdoctools-sl \
locale-kdoctools-sq \
locale-kdoctools-sr \
locale-kdoctools-sr@ijekavian \
locale-kdoctools-sr@ijekavianlatin \
locale-kdoctools-sr@latin \
locale-kdoctools-sv \
locale-kdoctools-ta \
locale-kdoctools-th \
locale-kdoctools-tr \
locale-kdoctools-ug \
locale-kdoctools-uk \
locale-kdoctools-vi \
locale-kdoctools-zh-CN \
locale-kdoctools-zh-TW"

RDEPENDS:${PN} += "kdoctools"

inherit rpm

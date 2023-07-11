SUMMARY = "Translations for package libKF5Completion5"
DESCRIPTION = "Provides translations for the 'libKF5Completion5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Completion5-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "80b7e107256bcaea892b51f60e8ecff17d22c81c584d1f1d07daf79ca944e1d83a2e1ba0277d5d57aa822c0d1f4f60dfad812c04b26ac292772cab10bf593282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Completion5-lang \
libKF5Completion5-lang-all \
locale-libKF5Completion5-af \
locale-libKF5Completion5-ar \
locale-libKF5Completion5-as \
locale-libKF5Completion5-az \
locale-libKF5Completion5-be \
locale-libKF5Completion5-be@latin \
locale-libKF5Completion5-bg \
locale-libKF5Completion5-bn \
locale-libKF5Completion5-bn-IN \
locale-libKF5Completion5-br \
locale-libKF5Completion5-bs \
locale-libKF5Completion5-ca \
locale-libKF5Completion5-ca@valencia \
locale-libKF5Completion5-cs \
locale-libKF5Completion5-cy \
locale-libKF5Completion5-da \
locale-libKF5Completion5-de \
locale-libKF5Completion5-el \
locale-libKF5Completion5-en-GB \
locale-libKF5Completion5-eo \
locale-libKF5Completion5-es \
locale-libKF5Completion5-et \
locale-libKF5Completion5-eu \
locale-libKF5Completion5-fa \
locale-libKF5Completion5-fi \
locale-libKF5Completion5-fr \
locale-libKF5Completion5-ga \
locale-libKF5Completion5-gd \
locale-libKF5Completion5-gl \
locale-libKF5Completion5-gu \
locale-libKF5Completion5-he \
locale-libKF5Completion5-hi \
locale-libKF5Completion5-hr \
locale-libKF5Completion5-hu \
locale-libKF5Completion5-ia \
locale-libKF5Completion5-id \
locale-libKF5Completion5-is \
locale-libKF5Completion5-it \
locale-libKF5Completion5-ja \
locale-libKF5Completion5-ka \
locale-libKF5Completion5-kk \
locale-libKF5Completion5-km \
locale-libKF5Completion5-kn \
locale-libKF5Completion5-ko \
locale-libKF5Completion5-lt \
locale-libKF5Completion5-lv \
locale-libKF5Completion5-mai \
locale-libKF5Completion5-mk \
locale-libKF5Completion5-ml \
locale-libKF5Completion5-mr \
locale-libKF5Completion5-ms \
locale-libKF5Completion5-nb \
locale-libKF5Completion5-nds \
locale-libKF5Completion5-ne \
locale-libKF5Completion5-nl \
locale-libKF5Completion5-nn \
locale-libKF5Completion5-oc \
locale-libKF5Completion5-or \
locale-libKF5Completion5-pa \
locale-libKF5Completion5-pl \
locale-libKF5Completion5-pt \
locale-libKF5Completion5-pt-BR \
locale-libKF5Completion5-ro \
locale-libKF5Completion5-ru \
locale-libKF5Completion5-si \
locale-libKF5Completion5-sk \
locale-libKF5Completion5-sl \
locale-libKF5Completion5-sq \
locale-libKF5Completion5-sr \
locale-libKF5Completion5-sr@ijekavian \
locale-libKF5Completion5-sr@ijekavianlatin \
locale-libKF5Completion5-sr@latin \
locale-libKF5Completion5-sv \
locale-libKF5Completion5-ta \
locale-libKF5Completion5-te \
locale-libKF5Completion5-th \
locale-libKF5Completion5-tr \
locale-libKF5Completion5-ug \
locale-libKF5Completion5-uk \
locale-libKF5Completion5-vi \
locale-libKF5Completion5-wa \
locale-libKF5Completion5-zh-CN \
locale-libKF5Completion5-zh-HK \
locale-libKF5Completion5-zh-TW"

RDEPENDS:${PN} += "libKF5Completion5"

inherit rpm

SUMMARY = "Translations for package kalgebra"
DESCRIPTION = "Provides translations for the 'kalgebra' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalgebra-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "4908f0120366667496794bae96c3c513d64740f8fcde2d6576bff97f1b10c6400d2258be4ea623aa8256734abeabc25a2cf613689a3396daf048630923e8256a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalgebra-lang \
kalgebra-lang-all \
locale-kalgebra-ar \
locale-kalgebra-be \
locale-kalgebra-bg \
locale-kalgebra-bs \
locale-kalgebra-ca \
locale-kalgebra-ca@valencia \
locale-kalgebra-cs \
locale-kalgebra-da \
locale-kalgebra-de \
locale-kalgebra-el \
locale-kalgebra-en-GB \
locale-kalgebra-eo \
locale-kalgebra-es \
locale-kalgebra-et \
locale-kalgebra-eu \
locale-kalgebra-fi \
locale-kalgebra-fr \
locale-kalgebra-ga \
locale-kalgebra-gl \
locale-kalgebra-hi \
locale-kalgebra-hr \
locale-kalgebra-hu \
locale-kalgebra-it \
locale-kalgebra-ja \
locale-kalgebra-ka \
locale-kalgebra-kk \
locale-kalgebra-km \
locale-kalgebra-ko \
locale-kalgebra-lt \
locale-kalgebra-lv \
locale-kalgebra-mai \
locale-kalgebra-ml \
locale-kalgebra-mr \
locale-kalgebra-nb \
locale-kalgebra-nds \
locale-kalgebra-nl \
locale-kalgebra-nn \
locale-kalgebra-oc \
locale-kalgebra-pa \
locale-kalgebra-pl \
locale-kalgebra-pt \
locale-kalgebra-pt-BR \
locale-kalgebra-ro \
locale-kalgebra-ru \
locale-kalgebra-si \
locale-kalgebra-sk \
locale-kalgebra-sl \
locale-kalgebra-sv \
locale-kalgebra-te \
locale-kalgebra-tr \
locale-kalgebra-ug \
locale-kalgebra-uk \
locale-kalgebra-zh-CN \
locale-kalgebra-zh-TW"

RDEPENDS:${PN} += "kalgebra"

inherit rpm

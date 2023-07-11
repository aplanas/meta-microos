SUMMARY = "Translations for package ksirk"
DESCRIPTION = "Provides translations for the 'ksirk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ksirk-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "00788ae1e331f60560108b1381c38dc3ede70f0b3ec31d15a805e63eea51c4a887298ecc68436d4941438a0cd5ea269484f4dc5715e55e61f4068851e46ef958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksirk-lang \
ksirk-lang-all \
locale-ksirk-ar \
locale-ksirk-be \
locale-ksirk-bg \
locale-ksirk-bs \
locale-ksirk-ca \
locale-ksirk-ca@valencia \
locale-ksirk-cs \
locale-ksirk-da \
locale-ksirk-de \
locale-ksirk-el \
locale-ksirk-en-GB \
locale-ksirk-eo \
locale-ksirk-es \
locale-ksirk-et \
locale-ksirk-fi \
locale-ksirk-fr \
locale-ksirk-ga \
locale-ksirk-gl \
locale-ksirk-hi \
locale-ksirk-hr \
locale-ksirk-hu \
locale-ksirk-is \
locale-ksirk-it \
locale-ksirk-ja \
locale-ksirk-ka \
locale-ksirk-kk \
locale-ksirk-km \
locale-ksirk-lt \
locale-ksirk-lv \
locale-ksirk-mai \
locale-ksirk-ml \
locale-ksirk-mr \
locale-ksirk-ms \
locale-ksirk-nb \
locale-ksirk-nds \
locale-ksirk-nl \
locale-ksirk-nn \
locale-ksirk-oc \
locale-ksirk-pl \
locale-ksirk-pt \
locale-ksirk-pt-BR \
locale-ksirk-ro \
locale-ksirk-ru \
locale-ksirk-sk \
locale-ksirk-sl \
locale-ksirk-sr \
locale-ksirk-sr@ijekavian \
locale-ksirk-sr@ijekavianlatin \
locale-ksirk-sr@latin \
locale-ksirk-sv \
locale-ksirk-tr \
locale-ksirk-ug \
locale-ksirk-uk \
locale-ksirk-zh-CN \
locale-ksirk-zh-TW"

RDEPENDS:${PN} += "ksirk"

inherit rpm

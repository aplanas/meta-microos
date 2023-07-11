SUMMARY = "Translations for package ksquares"
DESCRIPTION = "Provides translations for the 'ksquares' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ksquares-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2338e93747029a6c8e689f339e82dfa9edd1ad8193ced200c0daf68e126d472da6a853f678dbe377dfe41bd823bcb04f81a4a761bc764d0fe0912206b34a0046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksquares-lang \
ksquares-lang-all \
locale-ksquares-ar \
locale-ksquares-be \
locale-ksquares-bg \
locale-ksquares-bs \
locale-ksquares-ca \
locale-ksquares-ca@valencia \
locale-ksquares-cs \
locale-ksquares-da \
locale-ksquares-de \
locale-ksquares-el \
locale-ksquares-en-GB \
locale-ksquares-eo \
locale-ksquares-es \
locale-ksquares-et \
locale-ksquares-eu \
locale-ksquares-fi \
locale-ksquares-fr \
locale-ksquares-ga \
locale-ksquares-gl \
locale-ksquares-hi \
locale-ksquares-hr \
locale-ksquares-hu \
locale-ksquares-is \
locale-ksquares-it \
locale-ksquares-ja \
locale-ksquares-ka \
locale-ksquares-kk \
locale-ksquares-km \
locale-ksquares-ko \
locale-ksquares-lt \
locale-ksquares-lv \
locale-ksquares-mai \
locale-ksquares-ml \
locale-ksquares-mr \
locale-ksquares-nb \
locale-ksquares-nds \
locale-ksquares-nl \
locale-ksquares-nn \
locale-ksquares-oc \
locale-ksquares-pl \
locale-ksquares-pt \
locale-ksquares-pt-BR \
locale-ksquares-ro \
locale-ksquares-ru \
locale-ksquares-sk \
locale-ksquares-sl \
locale-ksquares-sq \
locale-ksquares-sr \
locale-ksquares-sr@ijekavian \
locale-ksquares-sr@ijekavianlatin \
locale-ksquares-sr@latin \
locale-ksquares-sv \
locale-ksquares-tr \
locale-ksquares-ug \
locale-ksquares-uk \
locale-ksquares-zh-CN \
locale-ksquares-zh-TW"

RDEPENDS:${PN} += "ksquares"

inherit rpm

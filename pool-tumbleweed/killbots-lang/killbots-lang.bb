SUMMARY = "Translations for package killbots"
DESCRIPTION = "Provides translations for the 'killbots' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "killbots-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "0fc23dc2bc965da1666e87e4f8d7f48b06aae253ec1b5dbbf978296202277a032bae249d43a1db1f88c0f2ae8243f90a3a852919778002d6f8aa475d7d9d6a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "killbots-lang \
killbots-lang-all \
locale-killbots-ar \
locale-killbots-bg \
locale-killbots-bs \
locale-killbots-ca \
locale-killbots-ca@valencia \
locale-killbots-cs \
locale-killbots-da \
locale-killbots-de \
locale-killbots-el \
locale-killbots-en-GB \
locale-killbots-eo \
locale-killbots-es \
locale-killbots-et \
locale-killbots-eu \
locale-killbots-fi \
locale-killbots-fr \
locale-killbots-ga \
locale-killbots-gl \
locale-killbots-hr \
locale-killbots-hu \
locale-killbots-id \
locale-killbots-is \
locale-killbots-it \
locale-killbots-ja \
locale-killbots-ka \
locale-killbots-kk \
locale-killbots-km \
locale-killbots-ko \
locale-killbots-lt \
locale-killbots-lv \
locale-killbots-mai \
locale-killbots-ml \
locale-killbots-mr \
locale-killbots-nb \
locale-killbots-nds \
locale-killbots-nl \
locale-killbots-nn \
locale-killbots-pl \
locale-killbots-pt \
locale-killbots-pt-BR \
locale-killbots-ro \
locale-killbots-ru \
locale-killbots-sk \
locale-killbots-sl \
locale-killbots-sr \
locale-killbots-sr@ijekavian \
locale-killbots-sr@ijekavianlatin \
locale-killbots-sr@latin \
locale-killbots-sv \
locale-killbots-tr \
locale-killbots-ug \
locale-killbots-uk \
locale-killbots-zh-CN \
locale-killbots-zh-TW"

RDEPENDS:${PN} += "killbots"

inherit rpm

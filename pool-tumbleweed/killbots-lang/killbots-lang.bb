SUMMARY = "Translations for package killbots"
DESCRIPTION = "Provides translations for the 'killbots' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "killbots-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "de13d0e82d9b964fc2300429b8c503ca88929dc737de3da1896802a61a2ddcc61a3d921b386c3f6f27e360feccd23de24e68c4f8331cedd411687e1e6aa491cc"
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

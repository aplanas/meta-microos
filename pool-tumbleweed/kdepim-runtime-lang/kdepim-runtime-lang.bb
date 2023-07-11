SUMMARY = "Translations for package kdepim-runtime"
DESCRIPTION = "Provides translations for the 'kdepim-runtime' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdepim-runtime-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "87b306cfefb524f51beea01fc8c97c58e1e8ba8bfed2fc219156623b131868a2c49ba0c10fc9d1aaee9173bee9481b1dd4122de93cac423a27353ec688f4c28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdepim-runtime-lang \
kdepim-runtime-lang-all \
locale-kdepim-runtime-ar \
locale-kdepim-runtime-bg \
locale-kdepim-runtime-bs \
locale-kdepim-runtime-ca \
locale-kdepim-runtime-ca@valencia \
locale-kdepim-runtime-cs \
locale-kdepim-runtime-da \
locale-kdepim-runtime-de \
locale-kdepim-runtime-el \
locale-kdepim-runtime-en-GB \
locale-kdepim-runtime-eo \
locale-kdepim-runtime-es \
locale-kdepim-runtime-et \
locale-kdepim-runtime-eu \
locale-kdepim-runtime-fi \
locale-kdepim-runtime-fr \
locale-kdepim-runtime-ga \
locale-kdepim-runtime-gl \
locale-kdepim-runtime-he \
locale-kdepim-runtime-hr \
locale-kdepim-runtime-hu \
locale-kdepim-runtime-ia \
locale-kdepim-runtime-id \
locale-kdepim-runtime-it \
locale-kdepim-runtime-ja \
locale-kdepim-runtime-ka \
locale-kdepim-runtime-kk \
locale-kdepim-runtime-km \
locale-kdepim-runtime-ko \
locale-kdepim-runtime-lt \
locale-kdepim-runtime-lv \
locale-kdepim-runtime-mai \
locale-kdepim-runtime-mr \
locale-kdepim-runtime-nb \
locale-kdepim-runtime-nds \
locale-kdepim-runtime-nl \
locale-kdepim-runtime-nn \
locale-kdepim-runtime-pa \
locale-kdepim-runtime-pl \
locale-kdepim-runtime-pt \
locale-kdepim-runtime-pt-BR \
locale-kdepim-runtime-ro \
locale-kdepim-runtime-ru \
locale-kdepim-runtime-sk \
locale-kdepim-runtime-sl \
locale-kdepim-runtime-sq \
locale-kdepim-runtime-sr \
locale-kdepim-runtime-sr@ijekavian \
locale-kdepim-runtime-sr@ijekavianlatin \
locale-kdepim-runtime-sr@latin \
locale-kdepim-runtime-sv \
locale-kdepim-runtime-th \
locale-kdepim-runtime-tr \
locale-kdepim-runtime-ug \
locale-kdepim-runtime-uk \
locale-kdepim-runtime-zh-CN \
locale-kdepim-runtime-zh-TW"

RDEPENDS:${PN} += "kdepim-runtime"

inherit rpm

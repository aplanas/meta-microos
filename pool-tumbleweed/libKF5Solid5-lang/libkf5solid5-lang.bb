SUMMARY = "Translations for package libKF5Solid5"
DESCRIPTION = "Provides translations for the 'libKF5Solid5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Solid5-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "10383bedb9627dda40d32909bfe46656d38947f663fa7117f531eb4b079c4698ac7da71c943468f409f5cb76377d17b03aa4ea386854410801b01294c76d1b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Solid5-lang \
libKF5Solid5-lang-all \
locale-libKF5Solid5-ar \
locale-libKF5Solid5-az \
locale-libKF5Solid5-bg \
locale-libKF5Solid5-bs \
locale-libKF5Solid5-ca \
locale-libKF5Solid5-ca@valencia \
locale-libKF5Solid5-cs \
locale-libKF5Solid5-da \
locale-libKF5Solid5-de \
locale-libKF5Solid5-el \
locale-libKF5Solid5-en-GB \
locale-libKF5Solid5-eo \
locale-libKF5Solid5-es \
locale-libKF5Solid5-et \
locale-libKF5Solid5-eu \
locale-libKF5Solid5-fi \
locale-libKF5Solid5-fr \
locale-libKF5Solid5-ga \
locale-libKF5Solid5-gd \
locale-libKF5Solid5-gl \
locale-libKF5Solid5-he \
locale-libKF5Solid5-hr \
locale-libKF5Solid5-hu \
locale-libKF5Solid5-ia \
locale-libKF5Solid5-id \
locale-libKF5Solid5-is \
locale-libKF5Solid5-it \
locale-libKF5Solid5-ja \
locale-libKF5Solid5-ka \
locale-libKF5Solid5-kk \
locale-libKF5Solid5-km \
locale-libKF5Solid5-ko \
locale-libKF5Solid5-lt \
locale-libKF5Solid5-lv \
locale-libKF5Solid5-ml \
locale-libKF5Solid5-mr \
locale-libKF5Solid5-ms \
locale-libKF5Solid5-nb \
locale-libKF5Solid5-nds \
locale-libKF5Solid5-nl \
locale-libKF5Solid5-nn \
locale-libKF5Solid5-pa \
locale-libKF5Solid5-pl \
locale-libKF5Solid5-pt \
locale-libKF5Solid5-pt-BR \
locale-libKF5Solid5-ro \
locale-libKF5Solid5-ru \
locale-libKF5Solid5-sk \
locale-libKF5Solid5-sl \
locale-libKF5Solid5-sr \
locale-libKF5Solid5-sr@ijekavian \
locale-libKF5Solid5-sr@ijekavianlatin \
locale-libKF5Solid5-sr@latin \
locale-libKF5Solid5-sv \
locale-libKF5Solid5-ta \
locale-libKF5Solid5-th \
locale-libKF5Solid5-tr \
locale-libKF5Solid5-ug \
locale-libKF5Solid5-uk \
locale-libKF5Solid5-zh-CN \
locale-libKF5Solid5-zh-TW"

RDEPENDS:${PN} += "libKF5Solid5"

inherit rpm

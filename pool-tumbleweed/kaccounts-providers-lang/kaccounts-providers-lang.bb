SUMMARY = "Translations for package kaccounts-providers"
DESCRIPTION = "Provides translations for the 'kaccounts-providers' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaccounts-providers-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "bc1136ac4d56fa57031f02fe2964ca763fdd5eb7f61d5b3c990c1e081912191efd84346fb3a4e6697ce02794435391071dfea4dfb7475be133390dae05940b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaccounts-providers-lang \
kaccounts-providers-lang-all \
locale-kaccounts-providers-ar \
locale-kaccounts-providers-az \
locale-kaccounts-providers-bg \
locale-kaccounts-providers-bs \
locale-kaccounts-providers-ca \
locale-kaccounts-providers-ca@valencia \
locale-kaccounts-providers-cs \
locale-kaccounts-providers-da \
locale-kaccounts-providers-de \
locale-kaccounts-providers-el \
locale-kaccounts-providers-en-GB \
locale-kaccounts-providers-es \
locale-kaccounts-providers-et \
locale-kaccounts-providers-eu \
locale-kaccounts-providers-fi \
locale-kaccounts-providers-fr \
locale-kaccounts-providers-gl \
locale-kaccounts-providers-hu \
locale-kaccounts-providers-ia \
locale-kaccounts-providers-id \
locale-kaccounts-providers-it \
locale-kaccounts-providers-ja \
locale-kaccounts-providers-ka \
locale-kaccounts-providers-ko \
locale-kaccounts-providers-lt \
locale-kaccounts-providers-nl \
locale-kaccounts-providers-nn \
locale-kaccounts-providers-pa \
locale-kaccounts-providers-pl \
locale-kaccounts-providers-pt \
locale-kaccounts-providers-pt-BR \
locale-kaccounts-providers-ro \
locale-kaccounts-providers-ru \
locale-kaccounts-providers-sk \
locale-kaccounts-providers-sl \
locale-kaccounts-providers-sr \
locale-kaccounts-providers-sr@ijekavian \
locale-kaccounts-providers-sr@ijekavianlatin \
locale-kaccounts-providers-sr@latin \
locale-kaccounts-providers-sv \
locale-kaccounts-providers-tr \
locale-kaccounts-providers-uk \
locale-kaccounts-providers-zh-CN \
locale-kaccounts-providers-zh-TW"

RDEPENDS:${PN} += "kaccounts-providers"

inherit rpm

SUMMARY = "Translations for package kwave"
DESCRIPTION = "Provides translations for the 'kwave' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwave-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "a284ab3dcdb9dd1a8647db8eed5d547ef1d5cbe3682ceeb78f7fa8a6a7be1adb22f15138c6b607e180335811ece3a8bf2528ad43bba766a0d34245e34307058c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwave-lang \
kwave-lang-all \
locale-kwave-bs \
locale-kwave-ca \
locale-kwave-ca@valencia \
locale-kwave-cs \
locale-kwave-da \
locale-kwave-de \
locale-kwave-el \
locale-kwave-en-GB \
locale-kwave-es \
locale-kwave-et \
locale-kwave-eu \
locale-kwave-fi \
locale-kwave-fr \
locale-kwave-gl \
locale-kwave-ia \
locale-kwave-it \
locale-kwave-ja \
locale-kwave-ka \
locale-kwave-ko \
locale-kwave-lt \
locale-kwave-nl \
locale-kwave-pl \
locale-kwave-pt \
locale-kwave-pt-BR \
locale-kwave-ru \
locale-kwave-sk \
locale-kwave-sl \
locale-kwave-sv \
locale-kwave-tr \
locale-kwave-uk \
locale-kwave-zh-CN \
locale-kwave-zh-TW"

RDEPENDS:${PN} += "kwave"

inherit rpm

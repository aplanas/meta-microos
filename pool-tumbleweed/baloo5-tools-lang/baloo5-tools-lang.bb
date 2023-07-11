SUMMARY = "Translations for package baloo5-tools"
DESCRIPTION = "Provides translations for the 'baloo5-tools' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "baloo5-tools-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "91db0aa8b900cf991d56319546d1485026bc0bbec15a9a3b2e320c422ce15bfbe1e9ce0dec1fb79efe34e95b337c58e6539cbdfbae4edc8cc10a0bffffbeabd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo5-tools-lang \
baloo5-tools-lang-all \
locale-baloo5-tools-ar \
locale-baloo5-tools-az \
locale-baloo5-tools-bg \
locale-baloo5-tools-bs \
locale-baloo5-tools-ca \
locale-baloo5-tools-ca@valencia \
locale-baloo5-tools-cs \
locale-baloo5-tools-da \
locale-baloo5-tools-de \
locale-baloo5-tools-el \
locale-baloo5-tools-en-GB \
locale-baloo5-tools-es \
locale-baloo5-tools-et \
locale-baloo5-tools-eu \
locale-baloo5-tools-fi \
locale-baloo5-tools-fr \
locale-baloo5-tools-gd \
locale-baloo5-tools-gl \
locale-baloo5-tools-hu \
locale-baloo5-tools-ia \
locale-baloo5-tools-id \
locale-baloo5-tools-it \
locale-baloo5-tools-ja \
locale-baloo5-tools-ka \
locale-baloo5-tools-ko \
locale-baloo5-tools-lt \
locale-baloo5-tools-ml \
locale-baloo5-tools-nb \
locale-baloo5-tools-nds \
locale-baloo5-tools-nl \
locale-baloo5-tools-nn \
locale-baloo5-tools-pa \
locale-baloo5-tools-pl \
locale-baloo5-tools-pt \
locale-baloo5-tools-pt-BR \
locale-baloo5-tools-ro \
locale-baloo5-tools-ru \
locale-baloo5-tools-sk \
locale-baloo5-tools-sl \
locale-baloo5-tools-sr \
locale-baloo5-tools-sr@ijekavian \
locale-baloo5-tools-sr@ijekavianlatin \
locale-baloo5-tools-sr@latin \
locale-baloo5-tools-sv \
locale-baloo5-tools-ta \
locale-baloo5-tools-tr \
locale-baloo5-tools-uk \
locale-baloo5-tools-zh-CN \
locale-baloo5-tools-zh-TW"

RDEPENDS:${PN} += "baloo5-tools"

inherit rpm

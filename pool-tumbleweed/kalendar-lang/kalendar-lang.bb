SUMMARY = "Translations for package kalendar"
DESCRIPTION = "Provides translations for the 'kalendar' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "kalendar-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "3e8038d4a11a3d5fbe60d9ad3d14908eb6c5f428d30265e3bc5edf7d07d15294eadda747bb86aede4593c5f91f1b1eaf5a61d583a19d4cd30b7885528a27b560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalendar-lang \
kalendar-lang-all \
locale-kalendar-ar \
locale-kalendar-az \
locale-kalendar-ca \
locale-kalendar-ca@valencia \
locale-kalendar-cs \
locale-kalendar-de \
locale-kalendar-el \
locale-kalendar-en-GB \
locale-kalendar-es \
locale-kalendar-eu \
locale-kalendar-fi \
locale-kalendar-fr \
locale-kalendar-gl \
locale-kalendar-hu \
locale-kalendar-id \
locale-kalendar-it \
locale-kalendar-ja \
locale-kalendar-ka \
locale-kalendar-ko \
locale-kalendar-lt \
locale-kalendar-lv \
locale-kalendar-nl \
locale-kalendar-nn \
locale-kalendar-pl \
locale-kalendar-pt \
locale-kalendar-pt-BR \
locale-kalendar-ru \
locale-kalendar-sk \
locale-kalendar-sl \
locale-kalendar-sv \
locale-kalendar-ta \
locale-kalendar-tr \
locale-kalendar-uk \
locale-kalendar-zh-CN \
locale-kalendar-zh-TW"

RDEPENDS:${PN} += "kalendar"

inherit rpm

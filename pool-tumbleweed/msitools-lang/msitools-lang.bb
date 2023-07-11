SUMMARY = "Translations for package msitools"
DESCRIPTION = "Provides translations for the 'msitools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.102"

RPM_NAME = "msitools-lang-0.102-1.1.noarch.rpm"
RPM_HASH = "0d1f72a588d918faf11e56f408470e9e309df81d2507351757c9f105633b263ec5acf77f04a63c9862ef12cf5b6103400a292ae3a86a4cb98ea202fd0cee21d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-msitools-bs \
locale-msitools-ca \
locale-msitools-cs \
locale-msitools-da \
locale-msitools-de \
locale-msitools-el \
locale-msitools-es \
locale-msitools-eu \
locale-msitools-fi \
locale-msitools-fr \
locale-msitools-fur \
locale-msitools-gl \
locale-msitools-hr \
locale-msitools-hu \
locale-msitools-id \
locale-msitools-it \
locale-msitools-ka \
locale-msitools-ko \
locale-msitools-lt \
locale-msitools-lv \
locale-msitools-nb \
locale-msitools-nl \
locale-msitools-oc \
locale-msitools-pl \
locale-msitools-pt \
locale-msitools-pt-BR \
locale-msitools-ro \
locale-msitools-ru \
locale-msitools-sl \
locale-msitools-sr \
locale-msitools-sr@latin \
locale-msitools-sv \
locale-msitools-tr \
locale-msitools-uk \
locale-msitools-zh-CN \
msitools-lang \
msitools-lang-all"

RDEPENDS:${PN} += "msitools"

inherit rpm

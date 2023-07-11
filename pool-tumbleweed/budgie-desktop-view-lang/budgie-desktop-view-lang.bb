SUMMARY = "Translations for package budgie-desktop-view"
DESCRIPTION = "Provides translations for the 'budgie-desktop-view' package."
LICENSE = "Apache-2.0"

PV = "1.2.1+0"

RPM_NAME = "budgie-desktop-view-lang-1.2.1+0-1.4.noarch.rpm"
RPM_HASH = "22ffc0d39f11fdc4c26c7a1e978cf2bd51831e3dd77cf2703e4032ec32b13162022212dd79a8d2e5b3a7edce89fd07c2d4f45a9f6999287ce510560cd9f96d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-view-lang \
budgie-desktop-view-lang-all \
locale-budgie-desktop-view-cs \
locale-budgie-desktop-view-en-GB \
locale-budgie-desktop-view-en-US \
locale-budgie-desktop-view-es \
locale-budgie-desktop-view-es-MX \
locale-budgie-desktop-view-fr \
locale-budgie-desktop-view-he \
locale-budgie-desktop-view-ja \
locale-budgie-desktop-view-ko \
locale-budgie-desktop-view-lt \
locale-budgie-desktop-view-pt-BR \
locale-budgie-desktop-view-pt-PT \
locale-budgie-desktop-view-ru \
locale-budgie-desktop-view-sq \
locale-budgie-desktop-view-tr \
locale-budgie-desktop-view-uk \
locale-budgie-desktop-view-zh \
locale-budgie-desktop-view-zh-CN"

RDEPENDS:${PN} += "budgie-desktop-view"

inherit rpm

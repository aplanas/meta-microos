SUMMARY = "Translations for package coreutils"
DESCRIPTION = "Provides translations for the 'coreutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "9.3"

RPM_NAME = "coreutils-lang-9.3-1.2.noarch.rpm"
RPM_HASH = "9efbd02932615a2fb0c762617685186915663928a47140fa269f40bb9b06db412c7c55f98dce600878a81c35f841bb066986b74da68a66a14bb278b925cbf47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-lang \
coreutils-lang-all \
locale-coreutils-af \
locale-coreutils-be \
locale-coreutils-bg \
locale-coreutils-ca \
locale-coreutils-cs \
locale-coreutils-da \
locale-coreutils-de \
locale-coreutils-el \
locale-coreutils-eo \
locale-coreutils-es \
locale-coreutils-et \
locale-coreutils-eu \
locale-coreutils-fi \
locale-coreutils-fr \
locale-coreutils-ga \
locale-coreutils-gl \
locale-coreutils-hr \
locale-coreutils-hu \
locale-coreutils-ia \
locale-coreutils-id \
locale-coreutils-it \
locale-coreutils-ja \
locale-coreutils-ka \
locale-coreutils-kk \
locale-coreutils-ko \
locale-coreutils-lt \
locale-coreutils-ms \
locale-coreutils-nb \
locale-coreutils-nl \
locale-coreutils-pl \
locale-coreutils-pt \
locale-coreutils-pt-BR \
locale-coreutils-ro \
locale-coreutils-ru \
locale-coreutils-sk \
locale-coreutils-sl \
locale-coreutils-sr \
locale-coreutils-sv \
locale-coreutils-tr \
locale-coreutils-uk \
locale-coreutils-vi \
locale-coreutils-zh-CN \
locale-coreutils-zh-TW"

RDEPENDS:${PN} += "coreutils"

inherit rpm

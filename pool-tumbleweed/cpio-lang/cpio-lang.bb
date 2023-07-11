SUMMARY = "Translations for package cpio"
DESCRIPTION = "Provides translations for the 'cpio' package."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-lang-2.13-5.5.noarch.rpm"
RPM_HASH = "450e62d884e279eff72e39f0f3c0332c4cd7eb825b55250ae5ef880dc76ae9af81f6c08319ffb7b1a38b9d13cec2b47e5b9ec5b77353c3f79a70828ebe2b1b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpio-lang \
cpio-lang-all \
locale-cpio-da \
locale-cpio-de \
locale-cpio-es \
locale-cpio-fi \
locale-cpio-fr \
locale-cpio-ga \
locale-cpio-gl \
locale-cpio-hr \
locale-cpio-hu \
locale-cpio-id \
locale-cpio-it \
locale-cpio-ja \
locale-cpio-ko \
locale-cpio-nl \
locale-cpio-pl \
locale-cpio-pt \
locale-cpio-pt-BR \
locale-cpio-ro \
locale-cpio-ru \
locale-cpio-sr \
locale-cpio-sv \
locale-cpio-tr \
locale-cpio-uk \
locale-cpio-vi \
locale-cpio-zh-CN \
locale-cpio-zh-TW"

RDEPENDS:${PN} += "cpio"

inherit rpm

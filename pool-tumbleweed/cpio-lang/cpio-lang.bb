SUMMARY = "Translations for package cpio"
DESCRIPTION = "Provides translations for the 'cpio' package."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "cpio-lang-2.13-5.3.noarch.rpm"
RPM_HASH = "a99b7ac990da321826260f4b53ec6223441e665e328f3834c0c9d068711f8f6cdedde116bcb5c7183a07c480d2da865f5c03956cbb02457857a16024d613647e"
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

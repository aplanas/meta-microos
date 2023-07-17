SUMMARY = "Translations for package cpio"
DESCRIPTION = "Provides translations for the 'cpio' package."
LICENSE = "GPL-3.0-only"

PV = "2.14"

RPM_NAME = "cpio-lang-2.14-1.1.noarch.rpm"
RPM_HASH = "78845efbeeda486bffad56c051aada466ff90be378b943abf12afbdcb20e393fc6c8fa36f3935ef425eb2c41130102b9af93198574fffd7c3aade7c91dac263b"
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
locale-cpio-ka \
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

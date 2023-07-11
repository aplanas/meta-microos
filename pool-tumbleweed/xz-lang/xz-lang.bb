SUMMARY = "Translations for package xz"
DESCRIPTION = "Provides translations for the 'xz' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "5.4.3"

RPM_NAME = "xz-lang-5.4.3-1.3.noarch.rpm"
RPM_HASH = "edfe25a1b1c85c31b73e27b8f4ae783da65db3f5d64bfa95a44605223fcb7c9c0bd0eb7f82a0d6734dede715fd7f1e7c84c25fcf5ee0b3b8f8d95ed2cb70510c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xz-ca \
locale-xz-cs \
locale-xz-da \
locale-xz-de \
locale-xz-eo \
locale-xz-es \
locale-xz-fi \
locale-xz-fr \
locale-xz-hr \
locale-xz-hu \
locale-xz-it \
locale-xz-ko \
locale-xz-pl \
locale-xz-pt \
locale-xz-pt-BR \
locale-xz-ro \
locale-xz-sr \
locale-xz-sv \
locale-xz-tr \
locale-xz-uk \
locale-xz-vi \
locale-xz-zh-CN \
locale-xz-zh-TW \
xz-lang \
xz-lang-all"

RDEPENDS:${PN} += "xz"

inherit rpm

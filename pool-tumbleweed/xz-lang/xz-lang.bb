SUMMARY = "Translations for package xz"
DESCRIPTION = "Provides translations for the 'xz' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "5.4.4"

RPM_NAME = "xz-lang-5.4.4-2.1.noarch.rpm"
RPM_HASH = "5bc17adf90b4655a40192826c760a5bcee5a1dd0f8f8b259b912be8c75329d11e779f8a6afb294779dc46cafd05ce7b6211667acd2ebceca440d39306969c3d7"
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

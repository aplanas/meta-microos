SUMMARY = "Translations for package libidn2"
DESCRIPTION = "Provides translations for the 'libidn2' package."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-lang-2.3.4-1.4.noarch.rpm"
RPM_HASH = "08fcda9ead29ad9815cd589d1f0e6621381a0afad255e4785a7c4d0e546f17c799e764e4924dc8f9318bb27b08ea33674c21c4f44dd6c068fbe6a069eb4f85a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libidn2-lang \
libidn2-lang-all \
locale-libidn2-cs \
locale-libidn2-da \
locale-libidn2-de \
locale-libidn2-eo \
locale-libidn2-es \
locale-libidn2-fi \
locale-libidn2-fr \
locale-libidn2-fur \
locale-libidn2-hr \
locale-libidn2-hu \
locale-libidn2-id \
locale-libidn2-it \
locale-libidn2-ja \
locale-libidn2-ka \
locale-libidn2-ko \
locale-libidn2-nl \
locale-libidn2-pl \
locale-libidn2-pt-BR \
locale-libidn2-ro \
locale-libidn2-ru \
locale-libidn2-sr \
locale-libidn2-sv \
locale-libidn2-uk \
locale-libidn2-vi \
locale-libidn2-zh-CN"

RDEPENDS:${PN} += "libidn2"

inherit rpm

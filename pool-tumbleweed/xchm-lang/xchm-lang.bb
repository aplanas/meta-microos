SUMMARY = "Translations for package xchm"
DESCRIPTION = "Provides translations for the 'xchm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.35"

RPM_NAME = "xchm-lang-1.35-1.4.noarch.rpm"
RPM_HASH = "5ffcb555eb86e878867b0230e3c3ba9af216f41c1ea917928b5ae645c5b89d705fa99e7d22cd7af5f5e60d1ed03f999306bb9247c501b0549b078d30ad1dc5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xchm-be \
locale-xchm-bg \
locale-xchm-cs \
locale-xchm-de \
locale-xchm-el \
locale-xchm-es \
locale-xchm-fr \
locale-xchm-hu \
locale-xchm-it \
locale-xchm-lv \
locale-xchm-pl \
locale-xchm-pt-BR \
locale-xchm-pt-PT \
locale-xchm-ro \
locale-xchm-ru \
locale-xchm-sk \
locale-xchm-sv \
locale-xchm-uk \
locale-xchm-zh-CN \
locale-xchm-zh-TW \
xchm-lang \
xchm-lang-all"

RDEPENDS:${PN} += "xchm"

inherit rpm

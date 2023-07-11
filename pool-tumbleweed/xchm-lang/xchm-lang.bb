SUMMARY = "Translations for package xchm"
DESCRIPTION = "Provides translations for the 'xchm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.35"

RPM_NAME = "xchm-lang-1.35-1.5.noarch.rpm"
RPM_HASH = "2a8f17152183c12e299bf0918f522de9dcf9b181794e0730d04e7e544f0c3123ee8597bab633df458e806e9b1de14e941b8867b01fc94ab6687db52e9db9f339"
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

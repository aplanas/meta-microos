SUMMARY = "Translations for package plasma5-nano"
DESCRIPTION = "Provides translations for the 'plasma5-nano' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-nano-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "072870df9aff30c69caff75f0a1e995fee963b049047e6d63da0bf09d386c41f6030cdbea944bfb4608d252cf06ddf39f3013f9b7e13e42b5682e9e9de610059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-nano-az \
locale-plasma5-nano-bg \
locale-plasma5-nano-ca \
locale-plasma5-nano-ca@valencia \
locale-plasma5-nano-cs \
locale-plasma5-nano-da \
locale-plasma5-nano-de \
locale-plasma5-nano-el \
locale-plasma5-nano-en-GB \
locale-plasma5-nano-es \
locale-plasma5-nano-et \
locale-plasma5-nano-eu \
locale-plasma5-nano-fi \
locale-plasma5-nano-fr \
locale-plasma5-nano-gl \
locale-plasma5-nano-hi \
locale-plasma5-nano-hu \
locale-plasma5-nano-ia \
locale-plasma5-nano-id \
locale-plasma5-nano-it \
locale-plasma5-nano-ja \
locale-plasma5-nano-ka \
locale-plasma5-nano-ko \
locale-plasma5-nano-lt \
locale-plasma5-nano-nl \
locale-plasma5-nano-nn \
locale-plasma5-nano-pl \
locale-plasma5-nano-pt \
locale-plasma5-nano-pt-BR \
locale-plasma5-nano-ro \
locale-plasma5-nano-ru \
locale-plasma5-nano-sk \
locale-plasma5-nano-sl \
locale-plasma5-nano-sv \
locale-plasma5-nano-ta \
locale-plasma5-nano-tr \
locale-plasma5-nano-uk \
locale-plasma5-nano-zh-CN \
locale-plasma5-nano-zh-TW \
plasma5-nano-lang \
plasma5-nano-lang-all"

RDEPENDS:${PN} += "plasma5-nano"

inherit rpm

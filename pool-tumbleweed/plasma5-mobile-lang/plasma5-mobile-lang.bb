SUMMARY = "Translations for package plasma5-mobile"
DESCRIPTION = "Provides translations for the 'plasma5-mobile' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-mobile-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "4c74f178bc030fc29117148e7986570a621391d568a3dd682f13eadbef5f3d8f8b6d2f71173b35c07ea317b5b63476af36613e95f8c8ab0b58a5b68fc16afbc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-mobile-az \
locale-plasma5-mobile-ca \
locale-plasma5-mobile-ca@valencia \
locale-plasma5-mobile-cs \
locale-plasma5-mobile-de \
locale-plasma5-mobile-en-GB \
locale-plasma5-mobile-es \
locale-plasma5-mobile-eu \
locale-plasma5-mobile-fi \
locale-plasma5-mobile-fr \
locale-plasma5-mobile-gl \
locale-plasma5-mobile-ia \
locale-plasma5-mobile-id \
locale-plasma5-mobile-is \
locale-plasma5-mobile-it \
locale-plasma5-mobile-ja \
locale-plasma5-mobile-ka \
locale-plasma5-mobile-ko \
locale-plasma5-mobile-nl \
locale-plasma5-mobile-nn \
locale-plasma5-mobile-pa \
locale-plasma5-mobile-pl \
locale-plasma5-mobile-pt \
locale-plasma5-mobile-pt-BR \
locale-plasma5-mobile-ro \
locale-plasma5-mobile-ru \
locale-plasma5-mobile-sk \
locale-plasma5-mobile-sl \
locale-plasma5-mobile-sv \
locale-plasma5-mobile-tr \
locale-plasma5-mobile-uk \
locale-plasma5-mobile-zh-CN \
locale-plasma5-mobile-zh-TW \
plasma5-mobile-lang \
plasma5-mobile-lang-all"

RDEPENDS:${PN} += "plasma5-mobile"

inherit rpm

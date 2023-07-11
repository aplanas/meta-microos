SUMMARY = "Translations for package krecorder"
DESCRIPTION = "Provides translations for the 'krecorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "krecorder-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "50920ecf187682981c1ff16fe47240676b997834c8b20d550ba15050bc1d2048af2765951c7b56cf0befd19ade91082798ff041cedc80474910c157428498bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krecorder-lang \
krecorder-lang-all \
locale-krecorder-ar \
locale-krecorder-ca \
locale-krecorder-ca@valencia \
locale-krecorder-cs \
locale-krecorder-de \
locale-krecorder-el \
locale-krecorder-en-GB \
locale-krecorder-es \
locale-krecorder-fi \
locale-krecorder-fr \
locale-krecorder-gl \
locale-krecorder-it \
locale-krecorder-ja \
locale-krecorder-ka \
locale-krecorder-ko \
locale-krecorder-lt \
locale-krecorder-nl \
locale-krecorder-nn \
locale-krecorder-pa \
locale-krecorder-pl \
locale-krecorder-pt \
locale-krecorder-pt-BR \
locale-krecorder-ro \
locale-krecorder-ru \
locale-krecorder-sk \
locale-krecorder-sl \
locale-krecorder-sv \
locale-krecorder-tr \
locale-krecorder-uk \
locale-krecorder-zh-CN \
locale-krecorder-zh-TW"

RDEPENDS:${PN} += "krecorder"

inherit rpm

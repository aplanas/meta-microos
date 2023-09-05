SUMMARY = "Translations for package kio-gdrive"
DESCRIPTION = "Provides translations for the 'kio-gdrive' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kio-gdrive-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "75cb96917a0e7941a710f3548c1bb814ce3d7765b0e02cf3489eafd0a7d39e26adac39d6d2bf62733fadb329941fa4821c1d5de4da29fbdce5d293008912017a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-gdrive-lang \
kio-gdrive-lang-all \
locale-kio-gdrive-ar \
locale-kio-gdrive-az \
locale-kio-gdrive-be \
locale-kio-gdrive-ca \
locale-kio-gdrive-ca@valencia \
locale-kio-gdrive-cs \
locale-kio-gdrive-da \
locale-kio-gdrive-de \
locale-kio-gdrive-el \
locale-kio-gdrive-en-GB \
locale-kio-gdrive-es \
locale-kio-gdrive-et \
locale-kio-gdrive-eu \
locale-kio-gdrive-fi \
locale-kio-gdrive-fr \
locale-kio-gdrive-gl \
locale-kio-gdrive-he \
locale-kio-gdrive-hi \
locale-kio-gdrive-hu \
locale-kio-gdrive-ia \
locale-kio-gdrive-id \
locale-kio-gdrive-it \
locale-kio-gdrive-ja \
locale-kio-gdrive-ka \
locale-kio-gdrive-ko \
locale-kio-gdrive-lt \
locale-kio-gdrive-nl \
locale-kio-gdrive-nn \
locale-kio-gdrive-pl \
locale-kio-gdrive-pt \
locale-kio-gdrive-pt-BR \
locale-kio-gdrive-ro \
locale-kio-gdrive-ru \
locale-kio-gdrive-sk \
locale-kio-gdrive-sl \
locale-kio-gdrive-sv \
locale-kio-gdrive-ta \
locale-kio-gdrive-tr \
locale-kio-gdrive-uk \
locale-kio-gdrive-zh-CN \
locale-kio-gdrive-zh-TW"

RDEPENDS:${PN} += "kio-gdrive"

inherit rpm

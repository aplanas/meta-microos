SUMMARY = "Translations for package kio-gdrive"
DESCRIPTION = "Provides translations for the 'kio-gdrive' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kio-gdrive-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9f75ce8bd1db71d77280ea1de93c2dd747a1b3f827cf15aa7359e035f13bb6d4c7e05080bbbf081ecdc01cf6c1cc7273bf7c814b5b9795d62150a551a123fab8"
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

SUMMARY = "Translations for package libgnome-keyring"
DESCRIPTION = "Provides translations for the 'libgnome-keyring' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring-lang-3.12.0-9.9.noarch.rpm"
RPM_HASH = "e35e764f2d7560c7855a8c0a0dd5fd1750163961065ce3821e901e8d1ce7d851e1ab6f608ead96e9b07190c4bf881af66b434fd96b1a7652a6f4ec2ac72ad0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnome-keyring-lang \
libgnome-keyring-lang-all \
locale-libgnome-keyring-af \
locale-libgnome-keyring-ar \
locale-libgnome-keyring-as \
locale-libgnome-keyring-ast \
locale-libgnome-keyring-be \
locale-libgnome-keyring-bg \
locale-libgnome-keyring-bn \
locale-libgnome-keyring-bn-IN \
locale-libgnome-keyring-ca \
locale-libgnome-keyring-ca@valencia \
locale-libgnome-keyring-cs \
locale-libgnome-keyring-da \
locale-libgnome-keyring-de \
locale-libgnome-keyring-el \
locale-libgnome-keyring-en-GB \
locale-libgnome-keyring-eo \
locale-libgnome-keyring-es \
locale-libgnome-keyring-et \
locale-libgnome-keyring-eu \
locale-libgnome-keyring-fa \
locale-libgnome-keyring-fi \
locale-libgnome-keyring-fr \
locale-libgnome-keyring-fur \
locale-libgnome-keyring-gd \
locale-libgnome-keyring-gl \
locale-libgnome-keyring-gu \
locale-libgnome-keyring-he \
locale-libgnome-keyring-hi \
locale-libgnome-keyring-hu \
locale-libgnome-keyring-id \
locale-libgnome-keyring-it \
locale-libgnome-keyring-ja \
locale-libgnome-keyring-km \
locale-libgnome-keyring-kn \
locale-libgnome-keyring-ko \
locale-libgnome-keyring-lt \
locale-libgnome-keyring-lv \
locale-libgnome-keyring-ml \
locale-libgnome-keyring-mr \
locale-libgnome-keyring-ms \
locale-libgnome-keyring-nb \
locale-libgnome-keyring-nds \
locale-libgnome-keyring-nl \
locale-libgnome-keyring-nn \
locale-libgnome-keyring-or \
locale-libgnome-keyring-pa \
locale-libgnome-keyring-pl \
locale-libgnome-keyring-pt \
locale-libgnome-keyring-pt-BR \
locale-libgnome-keyring-ro \
locale-libgnome-keyring-ru \
locale-libgnome-keyring-sk \
locale-libgnome-keyring-sl \
locale-libgnome-keyring-sr \
locale-libgnome-keyring-sr@latin \
locale-libgnome-keyring-sv \
locale-libgnome-keyring-ta \
locale-libgnome-keyring-te \
locale-libgnome-keyring-th \
locale-libgnome-keyring-tr \
locale-libgnome-keyring-ug \
locale-libgnome-keyring-uk \
locale-libgnome-keyring-vi \
locale-libgnome-keyring-zh-CN \
locale-libgnome-keyring-zh-HK \
locale-libgnome-keyring-zh-TW"

RDEPENDS:${PN} += "libgnome-keyring"

inherit rpm

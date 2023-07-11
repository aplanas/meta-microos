SUMMARY = "Translations for package kwave"
DESCRIPTION = "Provides translations for the 'kwave' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kwave-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "872d46c624b0bbc4079a9f3c8dd5cf430c24e2b43b3ec26f26ddedef5cb5a0d9e1de17e59616d60f18e359a5aa7c6659aa5f8255957f7dbb92a649e49384e412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwave-lang \
kwave-lang-all \
locale-kwave-bs \
locale-kwave-ca \
locale-kwave-ca@valencia \
locale-kwave-cs \
locale-kwave-da \
locale-kwave-de \
locale-kwave-el \
locale-kwave-en-GB \
locale-kwave-es \
locale-kwave-et \
locale-kwave-eu \
locale-kwave-fi \
locale-kwave-fr \
locale-kwave-gl \
locale-kwave-ia \
locale-kwave-it \
locale-kwave-ja \
locale-kwave-ka \
locale-kwave-ko \
locale-kwave-lt \
locale-kwave-nl \
locale-kwave-pl \
locale-kwave-pt \
locale-kwave-pt-BR \
locale-kwave-ru \
locale-kwave-sk \
locale-kwave-sl \
locale-kwave-sv \
locale-kwave-tr \
locale-kwave-uk \
locale-kwave-zh-CN \
locale-kwave-zh-TW"

RDEPENDS:${PN} += "kwave"

inherit rpm

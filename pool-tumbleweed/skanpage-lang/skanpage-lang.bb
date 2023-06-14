SUMMARY = "Translations for package skanpage"
DESCRIPTION = "Provides translations for the 'skanpage' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "skanpage-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e9fc35cbdb62d0c1483f939f8da853220224d97184ba95790dc7bfe0047c1050a466d8d5523301520bbebf827e5f29e0fd7363181c6b150c5753eaf2b7526ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanpage-ar \
locale-skanpage-be \
locale-skanpage-bg \
locale-skanpage-ca \
locale-skanpage-ca@valencia \
locale-skanpage-cs \
locale-skanpage-de \
locale-skanpage-el \
locale-skanpage-en-GB \
locale-skanpage-es \
locale-skanpage-eu \
locale-skanpage-fi \
locale-skanpage-fr \
locale-skanpage-ia \
locale-skanpage-id \
locale-skanpage-is \
locale-skanpage-it \
locale-skanpage-ja \
locale-skanpage-ka \
locale-skanpage-ko \
locale-skanpage-lt \
locale-skanpage-nl \
locale-skanpage-pl \
locale-skanpage-pt \
locale-skanpage-pt-BR \
locale-skanpage-ru \
locale-skanpage-sk \
locale-skanpage-sl \
locale-skanpage-sv \
locale-skanpage-tr \
locale-skanpage-uk \
locale-skanpage-zh-CN \
locale-skanpage-zh-TW \
skanpage-lang \
skanpage-lang-all"

RDEPENDS:${PN} += "skanpage"

inherit rpm

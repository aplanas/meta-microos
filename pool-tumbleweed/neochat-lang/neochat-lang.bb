SUMMARY = "Translations for package neochat"
DESCRIPTION = "Provides translations for the 'neochat' package."
LICENSE = "GPL-3.0-or-later & GPL-3.0-only & BSD-2-Clause"

PV = "23.08.0"

RPM_NAME = "neochat-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b5bd0163496af458e53bcb74977aeca42918bcfc36e5003d251c85727e06ba6ad2654690bed0816a678386fec2a7300b0547d1ffa25fcda2a1c9ee008f537e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neochat-ar \
locale-neochat-az \
locale-neochat-ca \
locale-neochat-ca@valencia \
locale-neochat-cs \
locale-neochat-da \
locale-neochat-de \
locale-neochat-el \
locale-neochat-en-GB \
locale-neochat-es \
locale-neochat-eu \
locale-neochat-fi \
locale-neochat-fr \
locale-neochat-hu \
locale-neochat-ia \
locale-neochat-id \
locale-neochat-it \
locale-neochat-ja \
locale-neochat-ka \
locale-neochat-ko \
locale-neochat-lt \
locale-neochat-nl \
locale-neochat-nn \
locale-neochat-pa \
locale-neochat-pl \
locale-neochat-pt \
locale-neochat-pt-BR \
locale-neochat-ru \
locale-neochat-sk \
locale-neochat-sl \
locale-neochat-sv \
locale-neochat-ta \
locale-neochat-tr \
locale-neochat-uk \
locale-neochat-zh-CN \
locale-neochat-zh-TW \
neochat-lang \
neochat-lang-all"

RDEPENDS:${PN} += "neochat"

inherit rpm

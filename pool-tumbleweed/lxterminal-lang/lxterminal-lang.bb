SUMMARY = "Translations for package lxterminal"
DESCRIPTION = "Provides translations for the 'lxterminal' package."
LICENSE = "GPL-2.0-only"

PV = "0.4.0"

RPM_NAME = "lxterminal-lang-0.4.0-1.11.noarch.rpm"
RPM_HASH = "69202cc24de4fd39d41bec141f0d3bdadb9fa86772360e06139c7165dbbf65cf7fb0f43a1ebea5a49ca4d817bd8cbcafc97da151b9e4e53e30b9eb03d6142da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxterminal-af \
locale-lxterminal-ar \
locale-lxterminal-be \
locale-lxterminal-bg \
locale-lxterminal-bn \
locale-lxterminal-bn-IN \
locale-lxterminal-ca \
locale-lxterminal-cs \
locale-lxterminal-da \
locale-lxterminal-de \
locale-lxterminal-el \
locale-lxterminal-en-GB \
locale-lxterminal-eo \
locale-lxterminal-es \
locale-lxterminal-et \
locale-lxterminal-eu \
locale-lxterminal-fa \
locale-lxterminal-fi \
locale-lxterminal-fr \
locale-lxterminal-gl \
locale-lxterminal-he \
locale-lxterminal-hr \
locale-lxterminal-hu \
locale-lxterminal-id \
locale-lxterminal-is \
locale-lxterminal-it \
locale-lxterminal-ja \
locale-lxterminal-kk \
locale-lxterminal-ko \
locale-lxterminal-lt \
locale-lxterminal-ml \
locale-lxterminal-ms \
locale-lxterminal-nb \
locale-lxterminal-nl \
locale-lxterminal-nn \
locale-lxterminal-pa \
locale-lxterminal-pl \
locale-lxterminal-pt \
locale-lxterminal-pt-BR \
locale-lxterminal-ro \
locale-lxterminal-ru \
locale-lxterminal-sk \
locale-lxterminal-sl \
locale-lxterminal-sr \
locale-lxterminal-sr@latin \
locale-lxterminal-sv \
locale-lxterminal-te \
locale-lxterminal-th \
locale-lxterminal-tr \
locale-lxterminal-ug \
locale-lxterminal-uk \
locale-lxterminal-vi \
locale-lxterminal-zh-CN \
locale-lxterminal-zh-TW \
lxterminal-lang \
lxterminal-lang-all"

RDEPENDS:${PN} += "lxterminal"

inherit rpm

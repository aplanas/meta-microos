SUMMARY = "Translations for package artikulate"
DESCRIPTION = "Provides translations for the 'artikulate' package."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.3"

RPM_NAME = "artikulate-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2176bc8cef6720744c657b5ea50543ca7e6482ffc1ace8eb01a4a831d285c18d7b3e7274af959ee81433a2af73dea0104fba5b86dbfa0db38e128374c746f07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artikulate-lang \
artikulate-lang-all \
locale-artikulate-ar \
locale-artikulate-az \
locale-artikulate-bs \
locale-artikulate-ca \
locale-artikulate-ca@valencia \
locale-artikulate-cs \
locale-artikulate-da \
locale-artikulate-de \
locale-artikulate-el \
locale-artikulate-en-GB \
locale-artikulate-eo \
locale-artikulate-es \
locale-artikulate-et \
locale-artikulate-eu \
locale-artikulate-fi \
locale-artikulate-fr \
locale-artikulate-gl \
locale-artikulate-hi \
locale-artikulate-hu \
locale-artikulate-ia \
locale-artikulate-it \
locale-artikulate-ja \
locale-artikulate-ka \
locale-artikulate-ko \
locale-artikulate-lt \
locale-artikulate-ml \
locale-artikulate-mr \
locale-artikulate-nds \
locale-artikulate-nl \
locale-artikulate-nn \
locale-artikulate-pl \
locale-artikulate-pt \
locale-artikulate-pt-BR \
locale-artikulate-ro \
locale-artikulate-ru \
locale-artikulate-sk \
locale-artikulate-sl \
locale-artikulate-sv \
locale-artikulate-tr \
locale-artikulate-ug \
locale-artikulate-uk \
locale-artikulate-zh-CN \
locale-artikulate-zh-TW"

RDEPENDS:${PN} += "artikulate"

inherit rpm

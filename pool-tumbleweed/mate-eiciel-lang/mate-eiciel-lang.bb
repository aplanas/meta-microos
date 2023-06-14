SUMMARY = "Translations for package mate-eiciel"
DESCRIPTION = "Provides translations for the 'mate-eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-lang-1.20.1-2.9.noarch.rpm"
RPM_HASH = "374bb597d9ec77c227de1a90cfd527a925e35aceb493e6d62d00e5efc87836ebc073510e8cd319753686ed85444d883bc5122b93b598150b3e2634d5cedd200f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-eiciel-ar \
locale-mate-eiciel-ca \
locale-mate-eiciel-cs \
locale-mate-eiciel-de \
locale-mate-eiciel-en-GB \
locale-mate-eiciel-en-US \
locale-mate-eiciel-es \
locale-mate-eiciel-fr \
locale-mate-eiciel-hu \
locale-mate-eiciel-it \
locale-mate-eiciel-ja \
locale-mate-eiciel-ko \
locale-mate-eiciel-nl \
locale-mate-eiciel-pl \
locale-mate-eiciel-pt-BR \
locale-mate-eiciel-ru \
locale-mate-eiciel-sv \
locale-mate-eiciel-zh-CN \
locale-mate-eiciel-zh-TW \
mate-eiciel-lang \
mate-eiciel-lang-all"

RDEPENDS:${PN} += "mate-eiciel"

inherit rpm

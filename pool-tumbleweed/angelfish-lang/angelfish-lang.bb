SUMMARY = "Translations for package angelfish"
DESCRIPTION = "Provides translations for the 'angelfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "angelfish-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "226970e295d3f64c470175c77b568eb24d9d1a32475013085ea5d1d40386d48ef028b9d85ffedee369ea37a24232385a272ad55802dec722edc88cf0c203dce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "angelfish-lang \
angelfish-lang-all \
locale-angelfish-az \
locale-angelfish-ca \
locale-angelfish-ca@valencia \
locale-angelfish-cs \
locale-angelfish-da \
locale-angelfish-de \
locale-angelfish-el \
locale-angelfish-en-GB \
locale-angelfish-es \
locale-angelfish-et \
locale-angelfish-eu \
locale-angelfish-fi \
locale-angelfish-fr \
locale-angelfish-gl \
locale-angelfish-hu \
locale-angelfish-ia \
locale-angelfish-id \
locale-angelfish-it \
locale-angelfish-ja \
locale-angelfish-ka \
locale-angelfish-ko \
locale-angelfish-lt \
locale-angelfish-nl \
locale-angelfish-nn \
locale-angelfish-pa \
locale-angelfish-pl \
locale-angelfish-pt \
locale-angelfish-pt-BR \
locale-angelfish-ru \
locale-angelfish-sk \
locale-angelfish-sl \
locale-angelfish-sv \
locale-angelfish-ta \
locale-angelfish-tr \
locale-angelfish-uk \
locale-angelfish-zh-CN \
locale-angelfish-zh-TW"

RDEPENDS:${PN} += "angelfish"

inherit rpm

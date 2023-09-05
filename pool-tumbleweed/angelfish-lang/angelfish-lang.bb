SUMMARY = "Translations for package angelfish"
DESCRIPTION = "Provides translations for the 'angelfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "angelfish-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0b5b354b7763c86a3d11de74767551b1a524515002c2223f239bf3e9a0b1efa1377e7864f7cc8e3e4dfdeff77dbba48ca811bd837de7649e91b84d40f2540804"
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

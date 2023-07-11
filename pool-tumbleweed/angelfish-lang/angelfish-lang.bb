SUMMARY = "Translations for package angelfish"
DESCRIPTION = "Provides translations for the 'angelfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "angelfish-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2084711f578c181098437cc1a4594bcccbb3f4479a2432ffd4471170ca7b3291f024a446affeb9497c17d1ac0e2c0238aec0b514b29867d504072ae47ed60917"
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

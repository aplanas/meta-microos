SUMMARY = "Translations for package elisa"
DESCRIPTION = "Provides translations for the 'elisa' package."
LICENSE = "LGPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "elisa-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "9f368f9983724eb663b04c8d459e6ac7da58bff966eeb0c1b48fd832658686c3c3e43f60788e88ab359e54fdbaca0dfdaa24169149db2cb4ee3808182511f9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elisa-lang \
elisa-lang-all \
locale-elisa-ar \
locale-elisa-az \
locale-elisa-be \
locale-elisa-bg \
locale-elisa-bs \
locale-elisa-ca \
locale-elisa-ca@valencia \
locale-elisa-cs \
locale-elisa-da \
locale-elisa-de \
locale-elisa-el \
locale-elisa-en-GB \
locale-elisa-es \
locale-elisa-et \
locale-elisa-eu \
locale-elisa-fi \
locale-elisa-fr \
locale-elisa-gl \
locale-elisa-hi \
locale-elisa-hu \
locale-elisa-ia \
locale-elisa-id \
locale-elisa-it \
locale-elisa-ja \
locale-elisa-ka \
locale-elisa-ko \
locale-elisa-lt \
locale-elisa-nl \
locale-elisa-nn \
locale-elisa-pa \
locale-elisa-pl \
locale-elisa-pt \
locale-elisa-pt-BR \
locale-elisa-ro \
locale-elisa-ru \
locale-elisa-sk \
locale-elisa-sl \
locale-elisa-sv \
locale-elisa-ta \
locale-elisa-tr \
locale-elisa-uk \
locale-elisa-zh-CN \
locale-elisa-zh-TW"

RDEPENDS:${PN} += "elisa"

inherit rpm

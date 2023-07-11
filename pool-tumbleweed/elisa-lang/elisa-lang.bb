SUMMARY = "Translations for package elisa"
DESCRIPTION = "Provides translations for the 'elisa' package."
LICENSE = "LGPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "elisa-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "be88a8f2a6e6d312eeeb0d529a81cd7c24da6fa0e174283408045c3c511fb4e8d2430c13f876fcaa443d52743ab1cc692d283b159a57767a6cadc0b67ef6ff12"
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

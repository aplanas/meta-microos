SUMMARY = "Translations for package elisa"
DESCRIPTION = "Provides translations for the 'elisa' package."
LICENSE = "LGPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "elisa-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "53b7b65ef978c2de72816509831b975d78f4b9c941d58e7784bc8cb58feaab3341aecaea9cd53a8bf4b5347c37238252f9d9131f78eadb45355a2ed6074e2fed"
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

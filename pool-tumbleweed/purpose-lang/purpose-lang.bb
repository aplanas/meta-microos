SUMMARY = "Translations for package purpose"
DESCRIPTION = "Provides translations for the 'purpose' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "purpose-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "bbbf256dc09d9c6dcbf5fc1e6929a4ad1744b595fb3690c3f7da38b4bf612fef3bb6f23f2adaf3c5dfdb1462b0ab4d6baa5ee8d49246a894e9d3ddd91809b771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-purpose-ar \
locale-purpose-az \
locale-purpose-bg \
locale-purpose-ca \
locale-purpose-ca@valencia \
locale-purpose-cs \
locale-purpose-da \
locale-purpose-de \
locale-purpose-el \
locale-purpose-en-GB \
locale-purpose-es \
locale-purpose-et \
locale-purpose-eu \
locale-purpose-fi \
locale-purpose-fr \
locale-purpose-gl \
locale-purpose-hu \
locale-purpose-ia \
locale-purpose-id \
locale-purpose-it \
locale-purpose-ja \
locale-purpose-ka \
locale-purpose-ko \
locale-purpose-lt \
locale-purpose-ml \
locale-purpose-nb \
locale-purpose-nl \
locale-purpose-nn \
locale-purpose-pl \
locale-purpose-pt \
locale-purpose-pt-BR \
locale-purpose-ro \
locale-purpose-ru \
locale-purpose-sk \
locale-purpose-sl \
locale-purpose-sq \
locale-purpose-sv \
locale-purpose-ta \
locale-purpose-tr \
locale-purpose-uk \
locale-purpose-zh-CN \
locale-purpose-zh-TW \
purpose-lang \
purpose-lang-all"

RDEPENDS:${PN} += "purpose"

inherit rpm

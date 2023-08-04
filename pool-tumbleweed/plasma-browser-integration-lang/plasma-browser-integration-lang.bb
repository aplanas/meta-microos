SUMMARY = "Translations for package plasma-browser-integration"
DESCRIPTION = "Provides translations for the 'plasma-browser-integration' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma-browser-integration-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "8358a4d921b93c9965ee816490863846373dadc5a855686293c0dc289424e4e90779e6e3ae32be91e8202c08298a8150cc060f35e833ddd2b5560dd5cab1c9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-browser-integration-ar \
locale-plasma-browser-integration-az \
locale-plasma-browser-integration-bg \
locale-plasma-browser-integration-ca \
locale-plasma-browser-integration-ca@valencia \
locale-plasma-browser-integration-cs \
locale-plasma-browser-integration-da \
locale-plasma-browser-integration-de \
locale-plasma-browser-integration-el \
locale-plasma-browser-integration-en-GB \
locale-plasma-browser-integration-es \
locale-plasma-browser-integration-et \
locale-plasma-browser-integration-eu \
locale-plasma-browser-integration-fi \
locale-plasma-browser-integration-fr \
locale-plasma-browser-integration-gl \
locale-plasma-browser-integration-hu \
locale-plasma-browser-integration-ia \
locale-plasma-browser-integration-id \
locale-plasma-browser-integration-it \
locale-plasma-browser-integration-ja \
locale-plasma-browser-integration-ka \
locale-plasma-browser-integration-ko \
locale-plasma-browser-integration-lt \
locale-plasma-browser-integration-ml \
locale-plasma-browser-integration-nl \
locale-plasma-browser-integration-nn \
locale-plasma-browser-integration-pa \
locale-plasma-browser-integration-pl \
locale-plasma-browser-integration-pt \
locale-plasma-browser-integration-pt-BR \
locale-plasma-browser-integration-ro \
locale-plasma-browser-integration-ru \
locale-plasma-browser-integration-sk \
locale-plasma-browser-integration-sl \
locale-plasma-browser-integration-sv \
locale-plasma-browser-integration-ta \
locale-plasma-browser-integration-tr \
locale-plasma-browser-integration-uk \
locale-plasma-browser-integration-zh-CN \
locale-plasma-browser-integration-zh-TW \
plasma-browser-integration-lang \
plasma-browser-integration-lang-all"

RDEPENDS:${PN} += "plasma-browser-integration"

inherit rpm

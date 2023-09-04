SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "Provides translations to the package kwallet-tools-lang"
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwallet-tools-lang-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ab551e9e777869e2bacd7ceb64cc41e20f554cd5b2da28ed709bb87af3c8560892429a424db9208e4b8094d5f586a18e202767cfab30f06530f0cad9fd5fa8ff"

RPROVIDES:${PN} += "kwallet-tools-lang \
locale-kwallet-tools-ar \
locale-kwallet-tools-az \
locale-kwallet-tools-bg \
locale-kwallet-tools-ca \
locale-kwallet-tools-ca@valencia \
locale-kwallet-tools-cs \
locale-kwallet-tools-da \
locale-kwallet-tools-de \
locale-kwallet-tools-el \
locale-kwallet-tools-en-GB \
locale-kwallet-tools-es \
locale-kwallet-tools-et \
locale-kwallet-tools-eu \
locale-kwallet-tools-fi \
locale-kwallet-tools-fr \
locale-kwallet-tools-gd \
locale-kwallet-tools-gl \
locale-kwallet-tools-hu \
locale-kwallet-tools-ia \
locale-kwallet-tools-id \
locale-kwallet-tools-it \
locale-kwallet-tools-ja \
locale-kwallet-tools-ka \
locale-kwallet-tools-ko \
locale-kwallet-tools-lt \
locale-kwallet-tools-ml \
locale-kwallet-tools-nl \
locale-kwallet-tools-nn \
locale-kwallet-tools-pa \
locale-kwallet-tools-pl \
locale-kwallet-tools-pt \
locale-kwallet-tools-pt-BR \
locale-kwallet-tools-ro \
locale-kwallet-tools-ru \
locale-kwallet-tools-sk \
locale-kwallet-tools-sl \
locale-kwallet-tools-sr \
locale-kwallet-tools-sr@ijekavian \
locale-kwallet-tools-sr@ijekavianlatin \
locale-kwallet-tools-sr@latin \
locale-kwallet-tools-sv \
locale-kwallet-tools-tr \
locale-kwallet-tools-uk \
locale-kwallet-tools-vi \
locale-kwallet-tools-zh-CN \
locale-kwallet-tools-zh-TW"

RDEPENDS:${PN} += "kwallet-tools"

inherit rpm

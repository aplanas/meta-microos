SUMMARY = "Translations for package skanpage"
DESCRIPTION = "Provides translations for the 'skanpage' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "skanpage-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "ee59ee1e04964b29e0652b06ddf5dafd1ed36ab02568932d27905f9faf2f5b2248402818fee1c7a0b6f1ee8ed5375730b11c722adc8f44e4d90ef985bc8c62f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanpage-ar \
locale-skanpage-be \
locale-skanpage-bg \
locale-skanpage-ca \
locale-skanpage-ca@valencia \
locale-skanpage-cs \
locale-skanpage-de \
locale-skanpage-el \
locale-skanpage-en-GB \
locale-skanpage-es \
locale-skanpage-eu \
locale-skanpage-fi \
locale-skanpage-fr \
locale-skanpage-ia \
locale-skanpage-id \
locale-skanpage-is \
locale-skanpage-it \
locale-skanpage-ja \
locale-skanpage-ka \
locale-skanpage-ko \
locale-skanpage-lt \
locale-skanpage-nl \
locale-skanpage-pl \
locale-skanpage-pt \
locale-skanpage-pt-BR \
locale-skanpage-ru \
locale-skanpage-sk \
locale-skanpage-sl \
locale-skanpage-sv \
locale-skanpage-tr \
locale-skanpage-uk \
locale-skanpage-zh-CN \
locale-skanpage-zh-TW \
skanpage-lang \
skanpage-lang-all"

RDEPENDS:${PN} += "skanpage"

inherit rpm

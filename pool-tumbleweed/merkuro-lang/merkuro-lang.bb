SUMMARY = "Translations for package merkuro"
DESCRIPTION = "Provides translations for the 'merkuro' package."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "merkuro-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "be5656bc6d472f27cb642bcc67d9264136e559b40e1b81e23ef71aa2dd1e9903f0f094b89caac3ea7b494f25e0db622b759ca39fdf7dfdf952d1cb750d15fcb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-merkuro-ar \
locale-merkuro-az \
locale-merkuro-ca \
locale-merkuro-ca@valencia \
locale-merkuro-cs \
locale-merkuro-de \
locale-merkuro-el \
locale-merkuro-en-GB \
locale-merkuro-es \
locale-merkuro-eu \
locale-merkuro-fi \
locale-merkuro-fr \
locale-merkuro-gl \
locale-merkuro-hu \
locale-merkuro-ia \
locale-merkuro-id \
locale-merkuro-it \
locale-merkuro-ja \
locale-merkuro-ka \
locale-merkuro-ko \
locale-merkuro-lt \
locale-merkuro-lv \
locale-merkuro-nl \
locale-merkuro-nn \
locale-merkuro-pl \
locale-merkuro-pt \
locale-merkuro-pt-BR \
locale-merkuro-ru \
locale-merkuro-sk \
locale-merkuro-sl \
locale-merkuro-sv \
locale-merkuro-ta \
locale-merkuro-tr \
locale-merkuro-uk \
locale-merkuro-zh-CN \
locale-merkuro-zh-TW \
merkuro-lang \
merkuro-lang-all"

RDEPENDS:${PN} += "merkuro"

inherit rpm

SUMMARY = "Translations for package libksane"
DESCRIPTION = "Provides translations for the 'libksane' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "libksane-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "71e74725c6f1edc56475d537abd5e319e314194a8aca32f7eb0dbab00040161bae6e6c7d4298dc4049fb6d1f13b16bdf171e7c20ed52b02b37452149b92453e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksane-lang \
libksane-lang-all \
locale-libksane-ar \
locale-libksane-be \
locale-libksane-bg \
locale-libksane-bs \
locale-libksane-ca \
locale-libksane-ca@valencia \
locale-libksane-cs \
locale-libksane-da \
locale-libksane-de \
locale-libksane-el \
locale-libksane-en-GB \
locale-libksane-eo \
locale-libksane-es \
locale-libksane-et \
locale-libksane-eu \
locale-libksane-fi \
locale-libksane-fr \
locale-libksane-ga \
locale-libksane-gl \
locale-libksane-hi \
locale-libksane-hr \
locale-libksane-hu \
locale-libksane-ia \
locale-libksane-id \
locale-libksane-is \
locale-libksane-it \
locale-libksane-ja \
locale-libksane-ka \
locale-libksane-kk \
locale-libksane-km \
locale-libksane-ko \
locale-libksane-lt \
locale-libksane-lv \
locale-libksane-ml \
locale-libksane-mr \
locale-libksane-nb \
locale-libksane-nds \
locale-libksane-nl \
locale-libksane-nn \
locale-libksane-oc \
locale-libksane-pa \
locale-libksane-pl \
locale-libksane-pt \
locale-libksane-pt-BR \
locale-libksane-ro \
locale-libksane-ru \
locale-libksane-sk \
locale-libksane-sl \
locale-libksane-sq \
locale-libksane-sv \
locale-libksane-th \
locale-libksane-tr \
locale-libksane-ug \
locale-libksane-uk \
locale-libksane-wa \
locale-libksane-zh-CN \
locale-libksane-zh-TW"

RDEPENDS:${PN} += "libksane"

inherit rpm

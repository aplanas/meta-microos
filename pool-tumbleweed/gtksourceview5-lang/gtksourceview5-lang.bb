SUMMARY = "Translations for package gtksourceview5"
DESCRIPTION = "Provides translations for the 'gtksourceview5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "gtksourceview5-lang-5.8.0-1.2.noarch.rpm"
RPM_HASH = "819f8db2f37c003deb9f2cf4f176d7c7626904e9086bb80245a180a69cb81528f6de7deec0edadaf50ebb41e20bf2c3b25a7e0e6272e5c9069c4d2e9458a4d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview5-lang \
gtksourceview5-lang-all \
locale-gtksourceview5-ar \
locale-gtksourceview5-as \
locale-gtksourceview5-ast \
locale-gtksourceview5-az \
locale-gtksourceview5-be \
locale-gtksourceview5-bg \
locale-gtksourceview5-bn \
locale-gtksourceview5-bn-IN \
locale-gtksourceview5-bs \
locale-gtksourceview5-ca \
locale-gtksourceview5-ca@valencia \
locale-gtksourceview5-cs \
locale-gtksourceview5-cy \
locale-gtksourceview5-da \
locale-gtksourceview5-de \
locale-gtksourceview5-dz \
locale-gtksourceview5-el \
locale-gtksourceview5-en-CA \
locale-gtksourceview5-en-GB \
locale-gtksourceview5-en@shaw \
locale-gtksourceview5-eo \
locale-gtksourceview5-es \
locale-gtksourceview5-et \
locale-gtksourceview5-eu \
locale-gtksourceview5-fa \
locale-gtksourceview5-fi \
locale-gtksourceview5-fr \
locale-gtksourceview5-fur \
locale-gtksourceview5-ga \
locale-gtksourceview5-gl \
locale-gtksourceview5-gu \
locale-gtksourceview5-he \
locale-gtksourceview5-hi \
locale-gtksourceview5-hr \
locale-gtksourceview5-hu \
locale-gtksourceview5-id \
locale-gtksourceview5-is \
locale-gtksourceview5-it \
locale-gtksourceview5-ja \
locale-gtksourceview5-ka \
locale-gtksourceview5-kk \
locale-gtksourceview5-kn \
locale-gtksourceview5-ko \
locale-gtksourceview5-lt \
locale-gtksourceview5-lv \
locale-gtksourceview5-mai \
locale-gtksourceview5-mk \
locale-gtksourceview5-ml \
locale-gtksourceview5-mr \
locale-gtksourceview5-ms \
locale-gtksourceview5-nb \
locale-gtksourceview5-ne \
locale-gtksourceview5-nl \
locale-gtksourceview5-nn \
locale-gtksourceview5-oc \
locale-gtksourceview5-or \
locale-gtksourceview5-pa \
locale-gtksourceview5-pl \
locale-gtksourceview5-pt \
locale-gtksourceview5-pt-BR \
locale-gtksourceview5-ro \
locale-gtksourceview5-ru \
locale-gtksourceview5-si \
locale-gtksourceview5-sk \
locale-gtksourceview5-sl \
locale-gtksourceview5-sq \
locale-gtksourceview5-sr \
locale-gtksourceview5-sr@latin \
locale-gtksourceview5-sv \
locale-gtksourceview5-ta \
locale-gtksourceview5-te \
locale-gtksourceview5-th \
locale-gtksourceview5-tr \
locale-gtksourceview5-ug \
locale-gtksourceview5-uk \
locale-gtksourceview5-vi \
locale-gtksourceview5-zh-CN \
locale-gtksourceview5-zh-HK \
locale-gtksourceview5-zh-TW"

RDEPENDS:${PN} += "gtksourceview5"

inherit rpm

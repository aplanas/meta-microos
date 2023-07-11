SUMMARY = "Translations for package gtksourceview"
DESCRIPTION = "Provides translations for the 'gtksourceview' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "gtksourceview-lang-3.24.11-3.10.noarch.rpm"
RPM_HASH = "ca61826758a9e3b2ba7fa363db24ba67a3e82be1ec69900614bbd9c14700fec32534ca66e40ea132df33f10eaebd246c000ae46abb3b9d078c9abe2e67ab4779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview-lang \
gtksourceview-lang-all \
locale-gtksourceview-ar \
locale-gtksourceview-as \
locale-gtksourceview-ast \
locale-gtksourceview-az \
locale-gtksourceview-be \
locale-gtksourceview-bg \
locale-gtksourceview-bn \
locale-gtksourceview-bn-IN \
locale-gtksourceview-bs \
locale-gtksourceview-ca \
locale-gtksourceview-ca@valencia \
locale-gtksourceview-cs \
locale-gtksourceview-cy \
locale-gtksourceview-da \
locale-gtksourceview-de \
locale-gtksourceview-dz \
locale-gtksourceview-el \
locale-gtksourceview-en-CA \
locale-gtksourceview-en-GB \
locale-gtksourceview-en@shaw \
locale-gtksourceview-eo \
locale-gtksourceview-es \
locale-gtksourceview-et \
locale-gtksourceview-eu \
locale-gtksourceview-fa \
locale-gtksourceview-fi \
locale-gtksourceview-fr \
locale-gtksourceview-fur \
locale-gtksourceview-ga \
locale-gtksourceview-gl \
locale-gtksourceview-gu \
locale-gtksourceview-he \
locale-gtksourceview-hi \
locale-gtksourceview-hr \
locale-gtksourceview-hu \
locale-gtksourceview-id \
locale-gtksourceview-it \
locale-gtksourceview-ja \
locale-gtksourceview-kk \
locale-gtksourceview-kn \
locale-gtksourceview-ko \
locale-gtksourceview-lt \
locale-gtksourceview-lv \
locale-gtksourceview-mai \
locale-gtksourceview-mk \
locale-gtksourceview-ml \
locale-gtksourceview-mr \
locale-gtksourceview-ms \
locale-gtksourceview-nb \
locale-gtksourceview-ne \
locale-gtksourceview-nl \
locale-gtksourceview-nn \
locale-gtksourceview-oc \
locale-gtksourceview-or \
locale-gtksourceview-pa \
locale-gtksourceview-pl \
locale-gtksourceview-pt \
locale-gtksourceview-pt-BR \
locale-gtksourceview-ro \
locale-gtksourceview-ru \
locale-gtksourceview-si \
locale-gtksourceview-sk \
locale-gtksourceview-sl \
locale-gtksourceview-sq \
locale-gtksourceview-sr \
locale-gtksourceview-sr@latin \
locale-gtksourceview-sv \
locale-gtksourceview-ta \
locale-gtksourceview-te \
locale-gtksourceview-th \
locale-gtksourceview-tr \
locale-gtksourceview-ug \
locale-gtksourceview-uk \
locale-gtksourceview-vi \
locale-gtksourceview-zh-CN \
locale-gtksourceview-zh-HK \
locale-gtksourceview-zh-TW"

RDEPENDS:${PN} += "gtksourceview"

inherit rpm

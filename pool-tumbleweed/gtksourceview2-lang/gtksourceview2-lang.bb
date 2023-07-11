SUMMARY = "Translations for package gtksourceview2"
DESCRIPTION = "Provides translations for the 'gtksourceview2' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "gtksourceview2-lang-2.10.5-20.10.noarch.rpm"
RPM_HASH = "f36ca9a7e1933852dfb9d9e1ba248255ab816557940762cc0b02e48992e87743925903ca6d888e1b9800592911d14d316376df7750f23b5467fa79e12088e7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview2-lang \
gtksourceview2-lang-all \
locale-gtksourceview2-ar \
locale-gtksourceview2-as \
locale-gtksourceview2-ast \
locale-gtksourceview2-az \
locale-gtksourceview2-be \
locale-gtksourceview2-bg \
locale-gtksourceview2-bn \
locale-gtksourceview2-bn-IN \
locale-gtksourceview2-bs \
locale-gtksourceview2-ca \
locale-gtksourceview2-ca@valencia \
locale-gtksourceview2-cs \
locale-gtksourceview2-cy \
locale-gtksourceview2-da \
locale-gtksourceview2-de \
locale-gtksourceview2-dz \
locale-gtksourceview2-el \
locale-gtksourceview2-en-CA \
locale-gtksourceview2-en-GB \
locale-gtksourceview2-en@shaw \
locale-gtksourceview2-es \
locale-gtksourceview2-et \
locale-gtksourceview2-eu \
locale-gtksourceview2-fa \
locale-gtksourceview2-fi \
locale-gtksourceview2-fr \
locale-gtksourceview2-ga \
locale-gtksourceview2-gl \
locale-gtksourceview2-gu \
locale-gtksourceview2-he \
locale-gtksourceview2-hi \
locale-gtksourceview2-hr \
locale-gtksourceview2-hu \
locale-gtksourceview2-id \
locale-gtksourceview2-it \
locale-gtksourceview2-ja \
locale-gtksourceview2-kn \
locale-gtksourceview2-ko \
locale-gtksourceview2-lt \
locale-gtksourceview2-lv \
locale-gtksourceview2-mai \
locale-gtksourceview2-mk \
locale-gtksourceview2-ml \
locale-gtksourceview2-mr \
locale-gtksourceview2-ms \
locale-gtksourceview2-nb \
locale-gtksourceview2-ne \
locale-gtksourceview2-nl \
locale-gtksourceview2-nn \
locale-gtksourceview2-oc \
locale-gtksourceview2-or \
locale-gtksourceview2-pa \
locale-gtksourceview2-pl \
locale-gtksourceview2-pt \
locale-gtksourceview2-pt-BR \
locale-gtksourceview2-ro \
locale-gtksourceview2-ru \
locale-gtksourceview2-si \
locale-gtksourceview2-sk \
locale-gtksourceview2-sl \
locale-gtksourceview2-sq \
locale-gtksourceview2-sr \
locale-gtksourceview2-sr@latin \
locale-gtksourceview2-sv \
locale-gtksourceview2-ta \
locale-gtksourceview2-te \
locale-gtksourceview2-th \
locale-gtksourceview2-tr \
locale-gtksourceview2-uk \
locale-gtksourceview2-vi \
locale-gtksourceview2-zh-CN \
locale-gtksourceview2-zh-HK \
locale-gtksourceview2-zh-TW"

RDEPENDS:${PN} += "gtksourceview2"

inherit rpm

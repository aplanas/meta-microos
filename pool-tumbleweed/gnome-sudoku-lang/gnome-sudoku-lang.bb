SUMMARY = "Translations for package gnome-sudoku"
DESCRIPTION = "Provides translations for the 'gnome-sudoku' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-sudoku-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "78c9b5b54fd33d79b505b7781bb42b15d0446d308464c1948188074a2dbec1cec97b7b7474eb12c1a20ba256991cde36437befb460938342d3a6a3dd2134c40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-sudoku-lang \
gnome-sudoku-lang-all \
locale-gnome-sudoku-af \
locale-gnome-sudoku-ar \
locale-gnome-sudoku-as \
locale-gnome-sudoku-ast \
locale-gnome-sudoku-az \
locale-gnome-sudoku-be \
locale-gnome-sudoku-bg \
locale-gnome-sudoku-bn \
locale-gnome-sudoku-bn-IN \
locale-gnome-sudoku-br \
locale-gnome-sudoku-bs \
locale-gnome-sudoku-ca \
locale-gnome-sudoku-ca@valencia \
locale-gnome-sudoku-cs \
locale-gnome-sudoku-cy \
locale-gnome-sudoku-da \
locale-gnome-sudoku-de \
locale-gnome-sudoku-dz \
locale-gnome-sudoku-el \
locale-gnome-sudoku-en-CA \
locale-gnome-sudoku-en-GB \
locale-gnome-sudoku-en@shaw \
locale-gnome-sudoku-eo \
locale-gnome-sudoku-es \
locale-gnome-sudoku-et \
locale-gnome-sudoku-eu \
locale-gnome-sudoku-fa \
locale-gnome-sudoku-fi \
locale-gnome-sudoku-fr \
locale-gnome-sudoku-fur \
locale-gnome-sudoku-ga \
locale-gnome-sudoku-gl \
locale-gnome-sudoku-gu \
locale-gnome-sudoku-he \
locale-gnome-sudoku-hi \
locale-gnome-sudoku-hr \
locale-gnome-sudoku-hu \
locale-gnome-sudoku-id \
locale-gnome-sudoku-is \
locale-gnome-sudoku-it \
locale-gnome-sudoku-ja \
locale-gnome-sudoku-ka \
locale-gnome-sudoku-kk \
locale-gnome-sudoku-km \
locale-gnome-sudoku-kn \
locale-gnome-sudoku-ko \
locale-gnome-sudoku-lt \
locale-gnome-sudoku-lv \
locale-gnome-sudoku-mai \
locale-gnome-sudoku-mk \
locale-gnome-sudoku-ml \
locale-gnome-sudoku-mr \
locale-gnome-sudoku-ms \
locale-gnome-sudoku-nb \
locale-gnome-sudoku-ne \
locale-gnome-sudoku-nl \
locale-gnome-sudoku-nn \
locale-gnome-sudoku-oc \
locale-gnome-sudoku-or \
locale-gnome-sudoku-pa \
locale-gnome-sudoku-pl \
locale-gnome-sudoku-pt \
locale-gnome-sudoku-pt-BR \
locale-gnome-sudoku-ro \
locale-gnome-sudoku-ru \
locale-gnome-sudoku-si \
locale-gnome-sudoku-sk \
locale-gnome-sudoku-sl \
locale-gnome-sudoku-sq \
locale-gnome-sudoku-sr \
locale-gnome-sudoku-sr@latin \
locale-gnome-sudoku-sv \
locale-gnome-sudoku-ta \
locale-gnome-sudoku-te \
locale-gnome-sudoku-th \
locale-gnome-sudoku-tr \
locale-gnome-sudoku-ug \
locale-gnome-sudoku-uk \
locale-gnome-sudoku-vi \
locale-gnome-sudoku-wa \
locale-gnome-sudoku-zh-CN \
locale-gnome-sudoku-zh-HK \
locale-gnome-sudoku-zh-TW"

RDEPENDS:${PN} += "gnome-sudoku"

inherit rpm

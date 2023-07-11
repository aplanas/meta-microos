SUMMARY = "Translations for package gtk2"
DESCRIPTION = "Provides translations for the 'gtk2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-lang-2.24.33-4.4.noarch.rpm"
RPM_HASH = "35e74060b5bc20e886b0bdd0dc0eacb33ac96addc8ddf166b03e37093a6e4f647385e5bd49cc1e2dfe8768744acd8cc6ccd0bf057af914614e4efe11c52b1d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-lang \
gtk2-lang-all \
locale-gtk2-af \
locale-gtk2-ar \
locale-gtk2-as \
locale-gtk2-ast \
locale-gtk2-az \
locale-gtk2-be \
locale-gtk2-be@latin \
locale-gtk2-bg \
locale-gtk2-bn \
locale-gtk2-bn-IN \
locale-gtk2-br \
locale-gtk2-bs \
locale-gtk2-ca \
locale-gtk2-ca@valencia \
locale-gtk2-cs \
locale-gtk2-cy \
locale-gtk2-da \
locale-gtk2-de \
locale-gtk2-dz \
locale-gtk2-el \
locale-gtk2-en-CA \
locale-gtk2-en-GB \
locale-gtk2-eo \
locale-gtk2-es \
locale-gtk2-et \
locale-gtk2-eu \
locale-gtk2-fa \
locale-gtk2-fi \
locale-gtk2-fr \
locale-gtk2-ga \
locale-gtk2-gl \
locale-gtk2-gu \
locale-gtk2-he \
locale-gtk2-hi \
locale-gtk2-hr \
locale-gtk2-hu \
locale-gtk2-ia \
locale-gtk2-id \
locale-gtk2-is \
locale-gtk2-it \
locale-gtk2-ja \
locale-gtk2-ka \
locale-gtk2-kk \
locale-gtk2-kn \
locale-gtk2-ko \
locale-gtk2-lt \
locale-gtk2-lv \
locale-gtk2-mai \
locale-gtk2-mk \
locale-gtk2-ml \
locale-gtk2-mr \
locale-gtk2-ms \
locale-gtk2-nb \
locale-gtk2-nds \
locale-gtk2-ne \
locale-gtk2-nl \
locale-gtk2-nn \
locale-gtk2-oc \
locale-gtk2-or \
locale-gtk2-pa \
locale-gtk2-pl \
locale-gtk2-pt \
locale-gtk2-pt-BR \
locale-gtk2-ro \
locale-gtk2-ru \
locale-gtk2-si \
locale-gtk2-sk \
locale-gtk2-sl \
locale-gtk2-sq \
locale-gtk2-sr \
locale-gtk2-sr@ije \
locale-gtk2-sr@latin \
locale-gtk2-sv \
locale-gtk2-ta \
locale-gtk2-te \
locale-gtk2-th \
locale-gtk2-tr \
locale-gtk2-ug \
locale-gtk2-uk \
locale-gtk2-vi \
locale-gtk2-wa \
locale-gtk2-zh-CN \
locale-gtk2-zh-HK \
locale-gtk2-zh-TW"

RDEPENDS:${PN} += "gtk2"

inherit rpm

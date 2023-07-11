SUMMARY = "Translations for package granite"
DESCRIPTION = "Provides translations for the 'granite' package."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-lang-6.2.0-1.8.noarch.rpm"
RPM_HASH = "df7fdca66e480da5439098d4bae1895890184ef64faa2d24c8348008fbc57ddb90bb3f4111d06208c455c02a463c05ba8a324d4343d4b8ddb9529c06c9a5666f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granite-lang \
granite-lang-all \
locale-granite-af \
locale-granite-ar \
locale-granite-as \
locale-granite-ast \
locale-granite-az \
locale-granite-be \
locale-granite-bg \
locale-granite-bn \
locale-granite-br \
locale-granite-bs \
locale-granite-ca \
locale-granite-cs \
locale-granite-cy \
locale-granite-da \
locale-granite-de \
locale-granite-dz \
locale-granite-el \
locale-granite-en-AU \
locale-granite-en-CA \
locale-granite-en-GB \
locale-granite-eo \
locale-granite-es \
locale-granite-et \
locale-granite-eu \
locale-granite-fa \
locale-granite-fi \
locale-granite-fr \
locale-granite-fr-CA \
locale-granite-ga \
locale-granite-gd \
locale-granite-gl \
locale-granite-gu \
locale-granite-he \
locale-granite-hi \
locale-granite-hr \
locale-granite-hu \
locale-granite-ia \
locale-granite-id \
locale-granite-is \
locale-granite-it \
locale-granite-ja \
locale-granite-ka \
locale-granite-kk \
locale-granite-km \
locale-granite-kn \
locale-granite-ko \
locale-granite-lt \
locale-granite-lv \
locale-granite-mk \
locale-granite-ml \
locale-granite-mr \
locale-granite-ms \
locale-granite-nb \
locale-granite-ne \
locale-granite-nl \
locale-granite-nn \
locale-granite-oc \
locale-granite-or \
locale-granite-pa \
locale-granite-pl \
locale-granite-pt \
locale-granite-pt-BR \
locale-granite-ro \
locale-granite-ru \
locale-granite-si \
locale-granite-sk \
locale-granite-sl \
locale-granite-sq \
locale-granite-sr \
locale-granite-sr@latin \
locale-granite-sv \
locale-granite-ta \
locale-granite-te \
locale-granite-th \
locale-granite-tr \
locale-granite-ug \
locale-granite-uk \
locale-granite-vi \
locale-granite-wa \
locale-granite-zh \
locale-granite-zh-CN \
locale-granite-zh-HK \
locale-granite-zh-TW"

RDEPENDS:${PN} += "granite"

inherit rpm

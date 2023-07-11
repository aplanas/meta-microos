SUMMARY = "Translations for package kexi"
DESCRIPTION = "Provides translations for the 'kexi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GFDL-1.2-only"

PV = "3.2.0"

RPM_NAME = "kexi-lang-3.2.0-8.9.noarch.rpm"
RPM_HASH = "f834ef6cf2e64958e124237a05b53471ca673dcc423d5ac51fe8060c79078d9157b99a9bbbfc6f25caca98858ae9bb34083971b7403bfb2d468a148bec7e4aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kexi-lang \
kexi-lang-all \
locale-kexi-ar \
locale-kexi-ast \
locale-kexi-be \
locale-kexi-bg \
locale-kexi-br \
locale-kexi-bs \
locale-kexi-ca \
locale-kexi-ca@valencia \
locale-kexi-cs \
locale-kexi-cy \
locale-kexi-da \
locale-kexi-de \
locale-kexi-el \
locale-kexi-en-GB \
locale-kexi-eo \
locale-kexi-es \
locale-kexi-et \
locale-kexi-eu \
locale-kexi-fa \
locale-kexi-fi \
locale-kexi-fr \
locale-kexi-ga \
locale-kexi-gl \
locale-kexi-he \
locale-kexi-hi \
locale-kexi-hr \
locale-kexi-hu \
locale-kexi-ia \
locale-kexi-it \
locale-kexi-ja \
locale-kexi-kk \
locale-kexi-km \
locale-kexi-ko \
locale-kexi-lt \
locale-kexi-mai \
locale-kexi-mr \
locale-kexi-ms \
locale-kexi-nb \
locale-kexi-nds \
locale-kexi-ne \
locale-kexi-nl \
locale-kexi-nn \
locale-kexi-oc \
locale-kexi-pl \
locale-kexi-pt \
locale-kexi-pt-BR \
locale-kexi-ro \
locale-kexi-ru \
locale-kexi-sk \
locale-kexi-sl \
locale-kexi-sq \
locale-kexi-sv \
locale-kexi-ta \
locale-kexi-tr \
locale-kexi-ug \
locale-kexi-uk \
locale-kexi-wa \
locale-kexi-zh-CN \
locale-kexi-zh-TW"

RDEPENDS:${PN} += "kexi"

inherit rpm

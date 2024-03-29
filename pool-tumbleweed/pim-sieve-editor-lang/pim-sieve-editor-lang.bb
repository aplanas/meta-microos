SUMMARY = "Translations for package pim-sieve-editor"
DESCRIPTION = "Provides translations for the 'pim-sieve-editor' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pim-sieve-editor-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "cf6ac6020382f47ed990d539883ae7388fe076bfb28607f660c4c190840f33f940df0fb4704516e2725b2fdb83ae1487c302c41f7d4cda4288ed04e46e52ed6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pim-sieve-editor-ar \
locale-pim-sieve-editor-az \
locale-pim-sieve-editor-bg \
locale-pim-sieve-editor-bs \
locale-pim-sieve-editor-ca \
locale-pim-sieve-editor-ca@valencia \
locale-pim-sieve-editor-cs \
locale-pim-sieve-editor-da \
locale-pim-sieve-editor-de \
locale-pim-sieve-editor-en-GB \
locale-pim-sieve-editor-eo \
locale-pim-sieve-editor-es \
locale-pim-sieve-editor-et \
locale-pim-sieve-editor-eu \
locale-pim-sieve-editor-fi \
locale-pim-sieve-editor-fr \
locale-pim-sieve-editor-gl \
locale-pim-sieve-editor-hu \
locale-pim-sieve-editor-ia \
locale-pim-sieve-editor-it \
locale-pim-sieve-editor-ja \
locale-pim-sieve-editor-ka \
locale-pim-sieve-editor-ko \
locale-pim-sieve-editor-lt \
locale-pim-sieve-editor-nb \
locale-pim-sieve-editor-nds \
locale-pim-sieve-editor-nl \
locale-pim-sieve-editor-pl \
locale-pim-sieve-editor-pt \
locale-pim-sieve-editor-pt-BR \
locale-pim-sieve-editor-ro \
locale-pim-sieve-editor-ru \
locale-pim-sieve-editor-sk \
locale-pim-sieve-editor-sl \
locale-pim-sieve-editor-sr \
locale-pim-sieve-editor-sr@ijekavian \
locale-pim-sieve-editor-sr@ijekavianlatin \
locale-pim-sieve-editor-sr@latin \
locale-pim-sieve-editor-sv \
locale-pim-sieve-editor-tr \
locale-pim-sieve-editor-uk \
locale-pim-sieve-editor-zh-CN \
locale-pim-sieve-editor-zh-TW \
pim-sieve-editor-lang \
pim-sieve-editor-lang-all"

RDEPENDS:${PN} += "pim-sieve-editor"

inherit rpm

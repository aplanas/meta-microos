SUMMARY = "Translations for package grantlee-editor"
DESCRIPTION = "Provides translations for the 'grantlee-editor' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "grantlee-editor-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e75741e32a20efd3f7eabb92f498d0772d8895af0885520ec48f9002de32ced7957ba33fcb50a985861975a4bcd5ac2e64a3761e68e7b544242832a63d9e0bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantlee-editor-lang \
grantlee-editor-lang-all \
locale-grantlee-editor-ar \
locale-grantlee-editor-bg \
locale-grantlee-editor-bs \
locale-grantlee-editor-ca \
locale-grantlee-editor-ca@valencia \
locale-grantlee-editor-cs \
locale-grantlee-editor-da \
locale-grantlee-editor-de \
locale-grantlee-editor-el \
locale-grantlee-editor-en-GB \
locale-grantlee-editor-es \
locale-grantlee-editor-et \
locale-grantlee-editor-eu \
locale-grantlee-editor-fi \
locale-grantlee-editor-fr \
locale-grantlee-editor-gl \
locale-grantlee-editor-hu \
locale-grantlee-editor-ia \
locale-grantlee-editor-it \
locale-grantlee-editor-ja \
locale-grantlee-editor-ka \
locale-grantlee-editor-kk \
locale-grantlee-editor-ko \
locale-grantlee-editor-lt \
locale-grantlee-editor-mr \
locale-grantlee-editor-nb \
locale-grantlee-editor-nds \
locale-grantlee-editor-nl \
locale-grantlee-editor-pl \
locale-grantlee-editor-pt \
locale-grantlee-editor-pt-BR \
locale-grantlee-editor-ro \
locale-grantlee-editor-ru \
locale-grantlee-editor-sk \
locale-grantlee-editor-sl \
locale-grantlee-editor-sr \
locale-grantlee-editor-sr@ijekavian \
locale-grantlee-editor-sr@ijekavianlatin \
locale-grantlee-editor-sr@latin \
locale-grantlee-editor-sv \
locale-grantlee-editor-tr \
locale-grantlee-editor-ug \
locale-grantlee-editor-uk \
locale-grantlee-editor-zh-CN \
locale-grantlee-editor-zh-TW"

RDEPENDS:${PN} += "grantlee-editor"

inherit rpm

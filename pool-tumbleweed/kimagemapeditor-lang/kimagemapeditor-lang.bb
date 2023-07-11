SUMMARY = "Translations for package kimagemapeditor"
DESCRIPTION = "Provides translations for the 'kimagemapeditor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kimagemapeditor-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "01e7f25c8f870d09b1e8252d7e0bcc5f64cde498c203dbd0daf5d74af8496ae1d1fcae5732395586b63bb24fb4fafaa9914f8d49f7b871ac15c77626c1e0768d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kimagemapeditor-lang \
kimagemapeditor-lang-all \
locale-kimagemapeditor-ar \
locale-kimagemapeditor-be \
locale-kimagemapeditor-bg \
locale-kimagemapeditor-br \
locale-kimagemapeditor-bs \
locale-kimagemapeditor-ca \
locale-kimagemapeditor-ca@valencia \
locale-kimagemapeditor-cs \
locale-kimagemapeditor-cy \
locale-kimagemapeditor-da \
locale-kimagemapeditor-de \
locale-kimagemapeditor-el \
locale-kimagemapeditor-en-GB \
locale-kimagemapeditor-eo \
locale-kimagemapeditor-es \
locale-kimagemapeditor-et \
locale-kimagemapeditor-eu \
locale-kimagemapeditor-fa \
locale-kimagemapeditor-fi \
locale-kimagemapeditor-fr \
locale-kimagemapeditor-ga \
locale-kimagemapeditor-gl \
locale-kimagemapeditor-hi \
locale-kimagemapeditor-hr \
locale-kimagemapeditor-hu \
locale-kimagemapeditor-it \
locale-kimagemapeditor-ja \
locale-kimagemapeditor-ka \
locale-kimagemapeditor-kk \
locale-kimagemapeditor-km \
locale-kimagemapeditor-ko \
locale-kimagemapeditor-lt \
locale-kimagemapeditor-lv \
locale-kimagemapeditor-mr \
locale-kimagemapeditor-ms \
locale-kimagemapeditor-nb \
locale-kimagemapeditor-nds \
locale-kimagemapeditor-ne \
locale-kimagemapeditor-nl \
locale-kimagemapeditor-nn \
locale-kimagemapeditor-oc \
locale-kimagemapeditor-pa \
locale-kimagemapeditor-pl \
locale-kimagemapeditor-pt \
locale-kimagemapeditor-pt-BR \
locale-kimagemapeditor-ro \
locale-kimagemapeditor-ru \
locale-kimagemapeditor-sk \
locale-kimagemapeditor-sl \
locale-kimagemapeditor-sv \
locale-kimagemapeditor-ta \
locale-kimagemapeditor-tr \
locale-kimagemapeditor-ug \
locale-kimagemapeditor-uk \
locale-kimagemapeditor-zh-CN \
locale-kimagemapeditor-zh-HK \
locale-kimagemapeditor-zh-TW"

RDEPENDS:${PN} += "kimagemapeditor"

inherit rpm

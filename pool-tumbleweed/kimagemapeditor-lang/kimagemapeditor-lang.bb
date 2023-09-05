SUMMARY = "Translations for package kimagemapeditor"
DESCRIPTION = "Provides translations for the 'kimagemapeditor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kimagemapeditor-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e56e17f4eb78558896ea0ab396b4f16e2fd46d31f9270a5baef991bce72a57a3d6a679361bdc69dafa04f0e7b96dcb855dab5b4c0623cd09d28ee22f8542fd98"
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

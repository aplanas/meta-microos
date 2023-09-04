SUMMARY = "Translations for package kirigami-addons"
DESCRIPTION = "Provides translations for the 'kirigami-addons' package."
LICENSE = "LGPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "kirigami-addons-lang-0.11.0-1.1.noarch.rpm"
RPM_HASH = "7514675e7eb1f52b8be747f0efc5b658f4255fe66e281df62e78f620363cc3bc1d5cb14f5f46606dc8b5dbf61392ef6c376a8daf46b737c97e2eb50e1b589054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-addons-lang \
kirigami-addons-lang-all \
locale-kirigami-addons-ar \
locale-kirigami-addons-az \
locale-kirigami-addons-bg \
locale-kirigami-addons-ca \
locale-kirigami-addons-ca@valencia \
locale-kirigami-addons-cs \
locale-kirigami-addons-de \
locale-kirigami-addons-el \
locale-kirigami-addons-en-GB \
locale-kirigami-addons-eo \
locale-kirigami-addons-es \
locale-kirigami-addons-eu \
locale-kirigami-addons-fi \
locale-kirigami-addons-fr \
locale-kirigami-addons-gl \
locale-kirigami-addons-hi \
locale-kirigami-addons-hu \
locale-kirigami-addons-it \
locale-kirigami-addons-ka \
locale-kirigami-addons-ko \
locale-kirigami-addons-nl \
locale-kirigami-addons-nn \
locale-kirigami-addons-pl \
locale-kirigami-addons-pt \
locale-kirigami-addons-pt-BR \
locale-kirigami-addons-ro \
locale-kirigami-addons-ru \
locale-kirigami-addons-sk \
locale-kirigami-addons-sl \
locale-kirigami-addons-sv \
locale-kirigami-addons-ta \
locale-kirigami-addons-tr \
locale-kirigami-addons-uk \
locale-kirigami-addons-zh-CN \
locale-kirigami-addons-zh-TW"

RDEPENDS:${PN} += "kirigami-addons"

inherit rpm

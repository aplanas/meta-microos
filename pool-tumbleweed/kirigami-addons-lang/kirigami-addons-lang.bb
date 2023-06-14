SUMMARY = "Translations for package kirigami-addons"
DESCRIPTION = "Provides translations for the 'kirigami-addons' package."
LICENSE = "LGPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "kirigami-addons-lang-0.8.0-1.2.noarch.rpm"
RPM_HASH = "6bc20c22943cb9217dc90305433dabddc879a8b704f4da013790e2924f36df5eccb94f2e16a3294ef7b4ad4252b00c7485f689f7906273a4a9aca2480b74171d"
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
locale-kirigami-addons-es \
locale-kirigami-addons-eu \
locale-kirigami-addons-fi \
locale-kirigami-addons-fr \
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

SUMMARY = "Translations for package kirigami-addons"
DESCRIPTION = "Provides translations for the 'kirigami-addons' package."
LICENSE = "LGPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "kirigami-addons-lang-0.10.0-1.1.noarch.rpm"
RPM_HASH = "3fcf0537228f97c89bdf513b64f4152042e45158be94fa463b1c2d7d9c15dbaca167384c092e1644852ea6ad7ce36886332111632e6effdb49f44c58174e5c8c"
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

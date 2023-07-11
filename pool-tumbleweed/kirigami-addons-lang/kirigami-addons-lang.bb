SUMMARY = "Translations for package kirigami-addons"
DESCRIPTION = "Provides translations for the 'kirigami-addons' package."
LICENSE = "LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "kirigami-addons-lang-0.9.0-1.1.noarch.rpm"
RPM_HASH = "e238adee964ed5406e25f504c6a060466a1445c42653be241c23c2b8888a9748303d2675ad16c08d50faee65de6651e79611cb0524cc8b4654f43e66f11e7b99"
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

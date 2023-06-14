SUMMARY = "Translations for package kirigami-gallery"
DESCRIPTION = "Provides translations for the 'kirigami-gallery' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kirigami-gallery-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8e6896c6dffee2328473888cf121aee4d9d6b8e623f09c0075a0bcfab1b053319185d361e3c28086b1120ab2bb00bcd38c83805a9157f472914f8a5842741eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-gallery-lang \
kirigami-gallery-lang-all \
locale-kirigami-gallery-ca \
locale-kirigami-gallery-ca@valencia \
locale-kirigami-gallery-cs \
locale-kirigami-gallery-da \
locale-kirigami-gallery-de \
locale-kirigami-gallery-el \
locale-kirigami-gallery-en-GB \
locale-kirigami-gallery-es \
locale-kirigami-gallery-et \
locale-kirigami-gallery-eu \
locale-kirigami-gallery-fi \
locale-kirigami-gallery-fr \
locale-kirigami-gallery-gl \
locale-kirigami-gallery-it \
locale-kirigami-gallery-ja \
locale-kirigami-gallery-ka \
locale-kirigami-gallery-ko \
locale-kirigami-gallery-lt \
locale-kirigami-gallery-nl \
locale-kirigami-gallery-nn \
locale-kirigami-gallery-pa \
locale-kirigami-gallery-pl \
locale-kirigami-gallery-pt \
locale-kirigami-gallery-pt-BR \
locale-kirigami-gallery-ro \
locale-kirigami-gallery-ru \
locale-kirigami-gallery-sk \
locale-kirigami-gallery-sl \
locale-kirigami-gallery-sv \
locale-kirigami-gallery-tr \
locale-kirigami-gallery-uk \
locale-kirigami-gallery-zh-CN \
locale-kirigami-gallery-zh-TW"

RDEPENDS:${PN} += "kirigami-gallery"

inherit rpm

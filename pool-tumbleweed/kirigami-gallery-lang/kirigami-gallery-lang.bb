SUMMARY = "Translations for package kirigami-gallery"
DESCRIPTION = "Provides translations for the 'kirigami-gallery' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kirigami-gallery-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "983a04414e245a7a1d1cdd141172ec434683093e3dcbc4c8fbf4f1d6254df448c8af9884635f0e724f2995a06216e6e29767ac075ed3493d576314272f2f9b47"
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

SUMMARY = "Translations for package kirigami2"
DESCRIPTION = "Provides translations for the 'kirigami2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kirigami2-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "0d43d895d5bdeb45685db2a1cf93c1197d40979f96d66623e1e49e61383d330110c3a1ec340bb72007d5d940efedee67c3d31383781cc4f298e11a01b3f86826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami2-lang \
kirigami2-lang-all \
locale-kirigami2-ar \
locale-kirigami2-az \
locale-kirigami2-bg \
locale-kirigami2-ca \
locale-kirigami2-ca@valencia \
locale-kirigami2-cs \
locale-kirigami2-da \
locale-kirigami2-de \
locale-kirigami2-el \
locale-kirigami2-en-GB \
locale-kirigami2-es \
locale-kirigami2-et \
locale-kirigami2-eu \
locale-kirigami2-fi \
locale-kirigami2-fr \
locale-kirigami2-gl \
locale-kirigami2-hi \
locale-kirigami2-hu \
locale-kirigami2-ia \
locale-kirigami2-id \
locale-kirigami2-it \
locale-kirigami2-ja \
locale-kirigami2-ka \
locale-kirigami2-ko \
locale-kirigami2-lt \
locale-kirigami2-ml \
locale-kirigami2-nl \
locale-kirigami2-nn \
locale-kirigami2-pa \
locale-kirigami2-pl \
locale-kirigami2-pt \
locale-kirigami2-pt-BR \
locale-kirigami2-ro \
locale-kirigami2-ru \
locale-kirigami2-sk \
locale-kirigami2-sl \
locale-kirigami2-sr \
locale-kirigami2-sr@ijekavian \
locale-kirigami2-sr@ijekavianlatin \
locale-kirigami2-sr@latin \
locale-kirigami2-sv \
locale-kirigami2-ta \
locale-kirigami2-tr \
locale-kirigami2-uk \
locale-kirigami2-zh-CN \
locale-kirigami2-zh-TW"

RDEPENDS:${PN} += "kirigami2"

inherit rpm

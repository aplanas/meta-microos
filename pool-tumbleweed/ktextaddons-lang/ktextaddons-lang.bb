SUMMARY = "Translations for package ktextaddons"
DESCRIPTION = "Provides translations for the 'ktextaddons' package."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ktextaddons-lang-1.4.1-1.1.noarch.rpm"
RPM_HASH = "1a06155c09bb2e52df3046163bad694c038779313f2ef645e0b343c27a2de245aa2770be9b7fcabcbc1d05cf94f1094b11d2912f01fef16f6cdb78390b085206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktextaddons-lang \
ktextaddons-lang-all \
locale-ktextaddons-ar \
locale-ktextaddons-az \
locale-ktextaddons-bg \
locale-ktextaddons-ca \
locale-ktextaddons-ca@valencia \
locale-ktextaddons-cs \
locale-ktextaddons-da \
locale-ktextaddons-de \
locale-ktextaddons-en-GB \
locale-ktextaddons-es \
locale-ktextaddons-et \
locale-ktextaddons-eu \
locale-ktextaddons-fi \
locale-ktextaddons-fr \
locale-ktextaddons-gl \
locale-ktextaddons-ia \
locale-ktextaddons-it \
locale-ktextaddons-ja \
locale-ktextaddons-ka \
locale-ktextaddons-ko \
locale-ktextaddons-lt \
locale-ktextaddons-nl \
locale-ktextaddons-nn \
locale-ktextaddons-pl \
locale-ktextaddons-pt \
locale-ktextaddons-pt-BR \
locale-ktextaddons-ru \
locale-ktextaddons-sk \
locale-ktextaddons-sl \
locale-ktextaddons-sv \
locale-ktextaddons-tr \
locale-ktextaddons-uk \
locale-ktextaddons-zh-CN \
locale-ktextaddons-zh-TW"

RDEPENDS:${PN} += "ktextaddons"

inherit rpm

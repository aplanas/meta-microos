SUMMARY = "Translations for package baloo5-kioslaves"
DESCRIPTION = "Provides translations for the 'baloo5-kioslaves' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-kioslaves-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "157001a5c4b3c59abe0cf3fc116825f32286850b5ee9705fae8c6d51d11cffb048002d61a285bdfa0b15ae3c860ed544e3ed536967127dcd1bf67d486b87c18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo5-kioslaves-lang \
baloo5-kioslaves-lang-all \
locale-baloo5-kioslaves-ar \
locale-baloo5-kioslaves-az \
locale-baloo5-kioslaves-bg \
locale-baloo5-kioslaves-bs \
locale-baloo5-kioslaves-ca \
locale-baloo5-kioslaves-ca@valencia \
locale-baloo5-kioslaves-cs \
locale-baloo5-kioslaves-da \
locale-baloo5-kioslaves-de \
locale-baloo5-kioslaves-el \
locale-baloo5-kioslaves-en-GB \
locale-baloo5-kioslaves-es \
locale-baloo5-kioslaves-et \
locale-baloo5-kioslaves-eu \
locale-baloo5-kioslaves-fi \
locale-baloo5-kioslaves-fr \
locale-baloo5-kioslaves-gd \
locale-baloo5-kioslaves-gl \
locale-baloo5-kioslaves-he \
locale-baloo5-kioslaves-hu \
locale-baloo5-kioslaves-ia \
locale-baloo5-kioslaves-id \
locale-baloo5-kioslaves-it \
locale-baloo5-kioslaves-ja \
locale-baloo5-kioslaves-ka \
locale-baloo5-kioslaves-ko \
locale-baloo5-kioslaves-lt \
locale-baloo5-kioslaves-ml \
locale-baloo5-kioslaves-nb \
locale-baloo5-kioslaves-nds \
locale-baloo5-kioslaves-nl \
locale-baloo5-kioslaves-nn \
locale-baloo5-kioslaves-pa \
locale-baloo5-kioslaves-pl \
locale-baloo5-kioslaves-pt \
locale-baloo5-kioslaves-pt-BR \
locale-baloo5-kioslaves-ro \
locale-baloo5-kioslaves-ru \
locale-baloo5-kioslaves-sk \
locale-baloo5-kioslaves-sl \
locale-baloo5-kioslaves-sr \
locale-baloo5-kioslaves-sr@ijekavian \
locale-baloo5-kioslaves-sr@ijekavianlatin \
locale-baloo5-kioslaves-sr@latin \
locale-baloo5-kioslaves-sv \
locale-baloo5-kioslaves-ta \
locale-baloo5-kioslaves-tr \
locale-baloo5-kioslaves-uk \
locale-baloo5-kioslaves-zh-CN \
locale-baloo5-kioslaves-zh-TW"

RDEPENDS:${PN} += "baloo5-kioslaves"

inherit rpm

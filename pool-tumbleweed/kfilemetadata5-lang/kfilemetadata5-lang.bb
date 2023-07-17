SUMMARY = "Translations for package kfilemetadata5"
DESCRIPTION = "Provides translations for the 'kfilemetadata5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "kfilemetadata5-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "47c8118517192e2738ff9881b115cbecad9fae4dc86ddf39abe9ded70d82d24054638c7ba2d736b2ccb15b77f986f600a994f34369a0422373e617f71d4ba70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfilemetadata5-lang \
kfilemetadata5-lang-all \
locale-kfilemetadata5-ar \
locale-kfilemetadata5-az \
locale-kfilemetadata5-bg \
locale-kfilemetadata5-bs \
locale-kfilemetadata5-ca \
locale-kfilemetadata5-ca@valencia \
locale-kfilemetadata5-cs \
locale-kfilemetadata5-da \
locale-kfilemetadata5-de \
locale-kfilemetadata5-el \
locale-kfilemetadata5-en-GB \
locale-kfilemetadata5-es \
locale-kfilemetadata5-et \
locale-kfilemetadata5-eu \
locale-kfilemetadata5-fi \
locale-kfilemetadata5-fr \
locale-kfilemetadata5-gd \
locale-kfilemetadata5-gl \
locale-kfilemetadata5-hu \
locale-kfilemetadata5-ia \
locale-kfilemetadata5-id \
locale-kfilemetadata5-it \
locale-kfilemetadata5-ja \
locale-kfilemetadata5-ka \
locale-kfilemetadata5-ko \
locale-kfilemetadata5-lt \
locale-kfilemetadata5-ml \
locale-kfilemetadata5-nb \
locale-kfilemetadata5-nds \
locale-kfilemetadata5-nl \
locale-kfilemetadata5-nn \
locale-kfilemetadata5-pa \
locale-kfilemetadata5-pl \
locale-kfilemetadata5-pt \
locale-kfilemetadata5-pt-BR \
locale-kfilemetadata5-ro \
locale-kfilemetadata5-ru \
locale-kfilemetadata5-sk \
locale-kfilemetadata5-sl \
locale-kfilemetadata5-sr \
locale-kfilemetadata5-sr@ijekavian \
locale-kfilemetadata5-sr@ijekavianlatin \
locale-kfilemetadata5-sr@latin \
locale-kfilemetadata5-sv \
locale-kfilemetadata5-ta \
locale-kfilemetadata5-tr \
locale-kfilemetadata5-uk \
locale-kfilemetadata5-zh-CN \
locale-kfilemetadata5-zh-TW"

RDEPENDS:${PN} += "kfilemetadata5"

inherit rpm

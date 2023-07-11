SUMMARY = "Translations for package kpackage"
DESCRIPTION = "Provides translations for the 'kpackage' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kpackage-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "c43b000b522587db7ebfefb0286aa2b26e0ac157bee2b70591155849489ea913dff78afac7e1d4c2bb5b2bb2e2e3c9a27c7201cd402c856791b3a73dd967e151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpackage-lang \
kpackage-lang-all \
locale-kpackage-ar \
locale-kpackage-az \
locale-kpackage-bs \
locale-kpackage-ca \
locale-kpackage-ca@valencia \
locale-kpackage-cs \
locale-kpackage-da \
locale-kpackage-de \
locale-kpackage-el \
locale-kpackage-en-GB \
locale-kpackage-es \
locale-kpackage-et \
locale-kpackage-eu \
locale-kpackage-fi \
locale-kpackage-fr \
locale-kpackage-gd \
locale-kpackage-gl \
locale-kpackage-he \
locale-kpackage-hu \
locale-kpackage-ia \
locale-kpackage-id \
locale-kpackage-it \
locale-kpackage-ja \
locale-kpackage-ka \
locale-kpackage-ko \
locale-kpackage-lt \
locale-kpackage-ml \
locale-kpackage-mr \
locale-kpackage-nb \
locale-kpackage-nds \
locale-kpackage-nl \
locale-kpackage-nn \
locale-kpackage-pa \
locale-kpackage-pl \
locale-kpackage-pt \
locale-kpackage-pt-BR \
locale-kpackage-ro \
locale-kpackage-ru \
locale-kpackage-sk \
locale-kpackage-sl \
locale-kpackage-sr \
locale-kpackage-sr@ijekavian \
locale-kpackage-sr@ijekavianlatin \
locale-kpackage-sr@latin \
locale-kpackage-sv \
locale-kpackage-tr \
locale-kpackage-ug \
locale-kpackage-uk \
locale-kpackage-zh-CN \
locale-kpackage-zh-TW"

RDEPENDS:${PN} += "kpackage"

inherit rpm

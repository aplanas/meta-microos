SUMMARY = "Translations for package ibus"
DESCRIPTION = "Provides translations for the 'ibus' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "ibus-lang-1.5.28-2.2.noarch.rpm"
RPM_HASH = "d575e6809bcab14e1fb51076371e9256760c296ca35ecf857546f95b6c1765269bd38153d39a828caea27007e23321c0cc3423b8d617397906ec83b393079816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-lang \
ibus-lang-all \
locale-ibus-ar \
locale-ibus-as \
locale-ibus-bg \
locale-ibus-bn \
locale-ibus-bn-IN \
locale-ibus-ca \
locale-ibus-cs \
locale-ibus-da \
locale-ibus-de \
locale-ibus-en-GB \
locale-ibus-es \
locale-ibus-et \
locale-ibus-eu \
locale-ibus-fa \
locale-ibus-fi \
locale-ibus-fr \
locale-ibus-gu \
locale-ibus-he \
locale-ibus-hi \
locale-ibus-hu \
locale-ibus-ia \
locale-ibus-id \
locale-ibus-it \
locale-ibus-ja \
locale-ibus-ka \
locale-ibus-kn \
locale-ibus-ko \
locale-ibus-lv \
locale-ibus-ml \
locale-ibus-mr \
locale-ibus-nb \
locale-ibus-nl \
locale-ibus-oc \
locale-ibus-or \
locale-ibus-pa \
locale-ibus-pl \
locale-ibus-pt \
locale-ibus-pt-BR \
locale-ibus-ru \
locale-ibus-sq \
locale-ibus-sr \
locale-ibus-sr@latin \
locale-ibus-sv \
locale-ibus-ta \
locale-ibus-te \
locale-ibus-tr \
locale-ibus-uk \
locale-ibus-vi \
locale-ibus-zh-CN \
locale-ibus-zh-HK \
locale-ibus-zh-TW"

RDEPENDS:${PN} += "ibus"

inherit rpm

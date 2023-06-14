SUMMARY = "Translations for package exo"
DESCRIPTION = "Provides translations for the 'exo' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.0"

RPM_NAME = "exo-lang-4.18.0-1.3.noarch.rpm"
RPM_HASH = "6d10c148d20dd7df01a5964361d1efa49a05977bc65d993548eacc891462f4663ca03c8b45296dd5dc220b782b9ff4f95bfd3f7fcd5b1a278e5b83f9d9008e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exo-lang \
exo-lang-all \
locale-exo-ar \
locale-exo-az \
locale-exo-be \
locale-exo-bg \
locale-exo-bn \
locale-exo-ca \
locale-exo-cs \
locale-exo-cy \
locale-exo-da \
locale-exo-de \
locale-exo-el \
locale-exo-en-AU \
locale-exo-en-GB \
locale-exo-es \
locale-exo-et \
locale-exo-eu \
locale-exo-fi \
locale-exo-fr \
locale-exo-gl \
locale-exo-he \
locale-exo-hr \
locale-exo-hu \
locale-exo-id \
locale-exo-is \
locale-exo-it \
locale-exo-ja \
locale-exo-ka \
locale-exo-kn \
locale-exo-ko \
locale-exo-lt \
locale-exo-lv \
locale-exo-ms \
locale-exo-nb \
locale-exo-nl \
locale-exo-nn \
locale-exo-oc \
locale-exo-pa \
locale-exo-pl \
locale-exo-pt \
locale-exo-pt-BR \
locale-exo-ro \
locale-exo-ru \
locale-exo-si \
locale-exo-sk \
locale-exo-sl \
locale-exo-sq \
locale-exo-sr \
locale-exo-sv \
locale-exo-te \
locale-exo-th \
locale-exo-tr \
locale-exo-ug \
locale-exo-uk \
locale-exo-vi \
locale-exo-zh-CN \
locale-exo-zh-HK \
locale-exo-zh-TW"

RDEPENDS:${PN} += "libexo-2-0"

inherit rpm

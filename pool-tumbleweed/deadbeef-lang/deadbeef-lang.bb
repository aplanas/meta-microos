SUMMARY = "Translations for package deadbeef"
DESCRIPTION = "Provides translations for the 'deadbeef' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & Zlib & LGPL-2.1-or-later"

PV = "1.9.5"

RPM_NAME = "deadbeef-lang-1.9.5-2.1.noarch.rpm"
RPM_HASH = "7d2f5f8f8d5d5b48a3cfd8811ab10cd11fda961dc7a46f4a83720bc863daa310efd06114229741245fe6d1069408d169c8c71450e0c7475ab8eab48dd6404bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deadbeef-lang \
deadbeef-lang-all \
locale-deadbeef-be \
locale-deadbeef-bg \
locale-deadbeef-bn \
locale-deadbeef-ca \
locale-deadbeef-cs \
locale-deadbeef-da \
locale-deadbeef-de \
locale-deadbeef-el \
locale-deadbeef-en-GB \
locale-deadbeef-es \
locale-deadbeef-et \
locale-deadbeef-eu \
locale-deadbeef-fa \
locale-deadbeef-fi \
locale-deadbeef-fr \
locale-deadbeef-gl \
locale-deadbeef-he \
locale-deadbeef-hr \
locale-deadbeef-hu \
locale-deadbeef-id \
locale-deadbeef-it \
locale-deadbeef-ja \
locale-deadbeef-kk \
locale-deadbeef-km \
locale-deadbeef-ko \
locale-deadbeef-lt \
locale-deadbeef-lv \
locale-deadbeef-nb \
locale-deadbeef-nl \
locale-deadbeef-pl \
locale-deadbeef-pt \
locale-deadbeef-pt-BR \
locale-deadbeef-ro \
locale-deadbeef-sk \
locale-deadbeef-sl \
locale-deadbeef-sr \
locale-deadbeef-sr@latin \
locale-deadbeef-sv \
locale-deadbeef-te \
locale-deadbeef-tr \
locale-deadbeef-ug \
locale-deadbeef-uk \
locale-deadbeef-vi \
locale-deadbeef-zh-CN \
locale-deadbeef-zh-TW"

RDEPENDS:${PN} += "deadbeef"

inherit rpm

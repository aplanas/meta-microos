SUMMARY = "Translations for package deadbeef"
DESCRIPTION = "Provides translations for the 'deadbeef' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & Zlib & LGPL-2.1-or-later"

PV = "1.9.5"

RPM_NAME = "deadbeef-lang-1.9.5-2.2.noarch.rpm"
RPM_HASH = "e1c4205beb8addc85f6540b33fdd6ebada7853a9956504da6e7d0b99de3c61a08c6cf1208e944bbfae56ba3b0a19249ddb4b048a67f573759d98ab615c965afc"
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

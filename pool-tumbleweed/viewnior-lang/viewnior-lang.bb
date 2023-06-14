SUMMARY = "Translations for package viewnior"
DESCRIPTION = "Provides translations for the 'viewnior' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-lang-1.8-1.6.noarch.rpm"
RPM_HASH = "e8748818b8e05c094108530b0eb047008feec04ddab8d8db99db7c2c5c62640ada4f272447d2169e12b3846c4b63cfad6086683e782f54799c9e2b0538992b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-viewnior-ar \
locale-viewnior-bg \
locale-viewnior-bs \
locale-viewnior-ca \
locale-viewnior-ca@valencia \
locale-viewnior-cs \
locale-viewnior-da \
locale-viewnior-de \
locale-viewnior-el \
locale-viewnior-en-GB \
locale-viewnior-es \
locale-viewnior-fi \
locale-viewnior-fr \
locale-viewnior-gl \
locale-viewnior-he \
locale-viewnior-hu \
locale-viewnior-it \
locale-viewnior-ja \
locale-viewnior-lt \
locale-viewnior-nb-NO \
locale-viewnior-nl \
locale-viewnior-oc \
locale-viewnior-pl \
locale-viewnior-pt \
locale-viewnior-pt-BR \
locale-viewnior-ru \
locale-viewnior-sk \
locale-viewnior-sr \
locale-viewnior-sv \
locale-viewnior-tr \
locale-viewnior-uk \
locale-viewnior-zh-CN \
locale-viewnior-zh-TW \
viewnior-lang \
viewnior-lang-all"

RDEPENDS:${PN} += "viewnior"

inherit rpm

SUMMARY = "Translations for package viewnior"
DESCRIPTION = "Provides translations for the 'viewnior' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-lang-1.8-1.7.noarch.rpm"
RPM_HASH = "435b1e4c4a22392928bda8d96a4768aa719787f3bf3be8c5acecc5b34439b3f70e0d3d9cfe82865829669292f8768f9a0845f03b7ef0cfc661b77c2a590e23df"
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

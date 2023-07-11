SUMMARY = "Translations for package eolie"
DESCRIPTION = "Provides translations for the 'eolie' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "eolie-lang-0.9.101-1.11.noarch.rpm"
RPM_HASH = "41188fbc5c2bfc13885ec01cbf7297c68129ddebde16cfb388ea78d7c35211cacb5fb8893e59c5aa15924eebf3e25f10ee3ed0e2e5369cff1c632d7c715fd8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eolie-lang \
eolie-lang-all \
locale-eolie-ar \
locale-eolie-de \
locale-eolie-el \
locale-eolie-eo \
locale-eolie-es \
locale-eolie-es-EC \
locale-eolie-fa \
locale-eolie-fi \
locale-eolie-fr \
locale-eolie-hr \
locale-eolie-hu \
locale-eolie-it \
locale-eolie-ko \
locale-eolie-lt \
locale-eolie-nb-NO \
locale-eolie-nl \
locale-eolie-nl-BE \
locale-eolie-pl \
locale-eolie-pt \
locale-eolie-pt-BR \
locale-eolie-pt-PT \
locale-eolie-ru \
locale-eolie-sv \
locale-eolie-tr \
locale-eolie-uk \
locale-eolie-zh-Hans \
locale-eolie-zh-Hant"

RDEPENDS:${PN} += "eolie"

inherit rpm

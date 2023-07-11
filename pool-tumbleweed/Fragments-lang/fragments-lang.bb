SUMMARY = "Translations for package Fragments"
DESCRIPTION = "Provides translations for the 'Fragments' package."
LICENSE = "GPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "Fragments-lang-2.1.1-1.1.noarch.rpm"
RPM_HASH = "d8c0005b7e195991c30d3a611f56f86551b73ab1330a47d182162f702d50d7fc2d813995c78801aca594ed9101b42a08881184e516e090c5b26240325e83241a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Fragments-lang \
Fragments-lang-all \
locale-Fragments-ca \
locale-Fragments-cs \
locale-Fragments-da \
locale-Fragments-de \
locale-Fragments-el \
locale-Fragments-en-GB \
locale-Fragments-eo \
locale-Fragments-es \
locale-Fragments-eu \
locale-Fragments-fi \
locale-Fragments-fr \
locale-Fragments-fur \
locale-Fragments-gl \
locale-Fragments-he \
locale-Fragments-hr \
locale-Fragments-hu \
locale-Fragments-id \
locale-Fragments-is \
locale-Fragments-it \
locale-Fragments-ja \
locale-Fragments-ka \
locale-Fragments-ko \
locale-Fragments-nb \
locale-Fragments-nl \
locale-Fragments-oc \
locale-Fragments-pl \
locale-Fragments-pt \
locale-Fragments-pt-BR \
locale-Fragments-ro \
locale-Fragments-ru \
locale-Fragments-sk \
locale-Fragments-sl \
locale-Fragments-sr \
locale-Fragments-sv \
locale-Fragments-tr \
locale-Fragments-uk \
locale-Fragments-vi \
locale-Fragments-zh-CN \
locale-Fragments-zh-TW"

RDEPENDS:${PN} += "Fragments"

inherit rpm

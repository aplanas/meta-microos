SUMMARY = "Translations for package meld"
DESCRIPTION = "Provides translations for the 'meld' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "meld-lang-3.22.0-1.2.noarch.rpm"
RPM_HASH = "53a5172e0fdcca827870cbb72025a29311d87b50980b354b7b58d97b13a12627e3d7c30a4631b5130e8338b7d40b4205575c71079433719c543e1c939edddcc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-meld-ar \
locale-meld-bg \
locale-meld-bs \
locale-meld-ca \
locale-meld-ca@valencia \
locale-meld-cs \
locale-meld-da \
locale-meld-de \
locale-meld-dz \
locale-meld-el \
locale-meld-en-CA \
locale-meld-en-GB \
locale-meld-eo \
locale-meld-es \
locale-meld-eu \
locale-meld-fi \
locale-meld-fr \
locale-meld-gl \
locale-meld-he \
locale-meld-hu \
locale-meld-id \
locale-meld-it \
locale-meld-ja \
locale-meld-ko \
locale-meld-nb \
locale-meld-ne \
locale-meld-nl \
locale-meld-oc \
locale-meld-pa \
locale-meld-pl \
locale-meld-pt \
locale-meld-pt-BR \
locale-meld-ro \
locale-meld-ru \
locale-meld-sk \
locale-meld-sl \
locale-meld-sq \
locale-meld-sr \
locale-meld-sr@latin \
locale-meld-sv \
locale-meld-tr \
locale-meld-uk \
locale-meld-vi \
locale-meld-zh-CN \
locale-meld-zh-TW \
meld-lang \
meld-lang-all"

RDEPENDS:${PN} += "meld"

inherit rpm

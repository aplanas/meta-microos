SUMMARY = "Translations for package warpinator"
DESCRIPTION = "Provides translations for the 'warpinator' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "warpinator-lang-1.6.1-1.1.noarch.rpm"
RPM_HASH = "5d53bfbb91232f95c032a3cbc77ffa3ebb0d928553c113924fec1080f01e1d1ac54d46edb9ec3ec30b2c9b3f6c1e0c499cf9b04fb4cbcec6c8f0fce3d8249e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-warpinator-ar \
locale-warpinator-be \
locale-warpinator-bn \
locale-warpinator-ca \
locale-warpinator-cs \
locale-warpinator-cy \
locale-warpinator-da \
locale-warpinator-de \
locale-warpinator-el \
locale-warpinator-en-GB \
locale-warpinator-eo \
locale-warpinator-es \
locale-warpinator-et \
locale-warpinator-eu \
locale-warpinator-fi \
locale-warpinator-fr \
locale-warpinator-fr-CA \
locale-warpinator-he \
locale-warpinator-hi \
locale-warpinator-hr \
locale-warpinator-hu \
locale-warpinator-ia \
locale-warpinator-id \
locale-warpinator-is \
locale-warpinator-it \
locale-warpinator-ja \
locale-warpinator-kk \
locale-warpinator-kn \
locale-warpinator-ko \
locale-warpinator-lt \
locale-warpinator-nl \
locale-warpinator-oc \
locale-warpinator-pl \
locale-warpinator-pt \
locale-warpinator-pt-BR \
locale-warpinator-ro \
locale-warpinator-ru \
locale-warpinator-sk \
locale-warpinator-sr \
locale-warpinator-sr@latin \
locale-warpinator-sv \
locale-warpinator-tr \
locale-warpinator-uk \
locale-warpinator-zh-CN \
locale-warpinator-zh-HK \
warpinator-lang \
warpinator-lang-all"

RDEPENDS:${PN} += "warpinator"

inherit rpm

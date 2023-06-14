SUMMARY = "Translations for package haguichi"
DESCRIPTION = "Provides translations for the 'haguichi' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.6"

RPM_NAME = "haguichi-lang-1.4.6-1.1.noarch.rpm"
RPM_HASH = "dc7be47822309424f7d9b9f3925bc866bf9e4dceccce35098e4a4853f7162472ab3e55b2e8d8143e1ca2c71907d26076fb3da3f1d862f153819c587690f0dcec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haguichi-lang \
haguichi-lang-all \
locale-haguichi-ast \
locale-haguichi-bg \
locale-haguichi-cs \
locale-haguichi-de \
locale-haguichi-es \
locale-haguichi-fr \
locale-haguichi-id \
locale-haguichi-it \
locale-haguichi-ja \
locale-haguichi-kk \
locale-haguichi-lt \
locale-haguichi-nl \
locale-haguichi-pl \
locale-haguichi-pt \
locale-haguichi-pt-BR \
locale-haguichi-ru \
locale-haguichi-sk \
locale-haguichi-sv \
locale-haguichi-tr \
locale-haguichi-uk"

RDEPENDS:${PN} += "haguichi"

inherit rpm

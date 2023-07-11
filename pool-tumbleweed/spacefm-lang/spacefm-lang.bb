SUMMARY = "Translations for package spacefm"
DESCRIPTION = "Provides translations for the 'spacefm' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "spacefm-lang-1.0.6-3.14.noarch.rpm"
RPM_HASH = "7b062b4b41e68e2158d4c2b339186c6247218d5bb5eea0c5129791eac7e9b194af348fafba1cd30c279e047e5058f95bec8d69b76750c6d3f4d21edd9c1b7aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spacefm-af \
locale-spacefm-ar \
locale-spacefm-bg \
locale-spacefm-bn-IN \
locale-spacefm-ca \
locale-spacefm-cs \
locale-spacefm-da \
locale-spacefm-de \
locale-spacefm-el \
locale-spacefm-es \
locale-spacefm-et \
locale-spacefm-eu \
locale-spacefm-fa \
locale-spacefm-fi \
locale-spacefm-fr \
locale-spacefm-gl \
locale-spacefm-he \
locale-spacefm-hr \
locale-spacefm-hu \
locale-spacefm-id \
locale-spacefm-it \
locale-spacefm-ja \
locale-spacefm-km \
locale-spacefm-ko \
locale-spacefm-lt \
locale-spacefm-ml \
locale-spacefm-ms \
locale-spacefm-nb \
locale-spacefm-nl \
locale-spacefm-nn \
locale-spacefm-pl \
locale-spacefm-pt \
locale-spacefm-pt-BR \
locale-spacefm-ru \
locale-spacefm-sk \
locale-spacefm-sl \
locale-spacefm-sr \
locale-spacefm-sr@latin \
locale-spacefm-sv \
locale-spacefm-tr \
locale-spacefm-uk \
locale-spacefm-vi \
locale-spacefm-zh-CN \
locale-spacefm-zh-TW \
spacefm-lang \
spacefm-lang-all"

RDEPENDS:${PN} += "spacefm"

inherit rpm

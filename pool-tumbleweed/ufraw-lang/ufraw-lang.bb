SUMMARY = "Translations for package ufraw"
DESCRIPTION = "Provides translations for the 'ufraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-lang-0.22-12.1.noarch.rpm"
RPM_HASH = "50a94617c4e5e44c01d3147ea9e5d16d6f2b9aa31403a83927ce1d7c037d1a25fb5ad46da437aa468e527db5ba8f550ba5e30994a8e128b5a03f4f24ff7d6077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ufraw-ca \
locale-ufraw-cs \
locale-ufraw-da \
locale-ufraw-de \
locale-ufraw-es \
locale-ufraw-fr \
locale-ufraw-it \
locale-ufraw-ja \
locale-ufraw-ko \
locale-ufraw-nb \
locale-ufraw-nl \
locale-ufraw-pl \
locale-ufraw-pt \
locale-ufraw-ru \
locale-ufraw-sr \
locale-ufraw-sr@latin \
locale-ufraw-sv \
locale-ufraw-zh-CN \
locale-ufraw-zh-TW \
ufraw-lang \
ufraw-lang-all"

RDEPENDS:${PN} += "ufraw"

inherit rpm

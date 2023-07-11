SUMMARY = "Translations for package findutils"
DESCRIPTION = "Provides translations for the 'findutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.9.0"

RPM_NAME = "findutils-lang-4.9.0-2.5.noarch.rpm"
RPM_HASH = "aab769860ec627847295fb003e1483082a6ba69bc298c635ccea430fbc8bfa548f76b0a60892bac35b1b6087222c13eb8bc59f0cba1ac32bde84e64ce3591524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findutils-lang \
findutils-lang-all \
locale-findutils-be \
locale-findutils-bg \
locale-findutils-ca \
locale-findutils-cs \
locale-findutils-da \
locale-findutils-de \
locale-findutils-el \
locale-findutils-eo \
locale-findutils-es \
locale-findutils-et \
locale-findutils-fi \
locale-findutils-fr \
locale-findutils-ga \
locale-findutils-gl \
locale-findutils-hr \
locale-findutils-hu \
locale-findutils-id \
locale-findutils-it \
locale-findutils-ja \
locale-findutils-ko \
locale-findutils-lt \
locale-findutils-ms \
locale-findutils-nb \
locale-findutils-nl \
locale-findutils-pl \
locale-findutils-pt \
locale-findutils-pt-BR \
locale-findutils-ro \
locale-findutils-ru \
locale-findutils-sk \
locale-findutils-sl \
locale-findutils-sr \
locale-findutils-sv \
locale-findutils-tr \
locale-findutils-uk \
locale-findutils-vi \
locale-findutils-zh-CN \
locale-findutils-zh-TW"

RDEPENDS:${PN} += "findutils"

inherit rpm

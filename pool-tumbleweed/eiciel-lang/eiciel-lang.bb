SUMMARY = "Translations for package eiciel"
DESCRIPTION = "Provides translations for the 'eiciel' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0"

RPM_NAME = "eiciel-lang-0.10.0-1.1.noarch.rpm"
RPM_HASH = "d089bba244d37bd39b54bdfb9a616c80f396709e2f48c00e6d4192159b5928227c716222b2c33b06153780d2499e4f04f3cad4862dabf3900a8c592ca1932a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiciel-lang \
eiciel-lang-all \
locale-eiciel-ar \
locale-eiciel-ca \
locale-eiciel-cs \
locale-eiciel-da \
locale-eiciel-de \
locale-eiciel-es \
locale-eiciel-fa \
locale-eiciel-fr \
locale-eiciel-hi \
locale-eiciel-hu \
locale-eiciel-id \
locale-eiciel-it \
locale-eiciel-ja \
locale-eiciel-ko \
locale-eiciel-nl \
locale-eiciel-nn \
locale-eiciel-pl \
locale-eiciel-pt-BR \
locale-eiciel-ru \
locale-eiciel-sv \
locale-eiciel-uk \
locale-eiciel-zh-CN \
locale-eiciel-zh-TW"

RDEPENDS:${PN} += "eiciel"

inherit rpm

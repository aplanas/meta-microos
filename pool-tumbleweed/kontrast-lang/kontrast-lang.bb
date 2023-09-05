SUMMARY = "Translations for package kontrast"
DESCRIPTION = "Provides translations for the 'kontrast' package."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "kontrast-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "5bef296211735131cedafe8775e521f5a79d99323ad4d0a6be76e4e2e42ba2c9d2b964536111770bee0a79a99e287cd1e73857f4da59603c53e11f30ce8d1266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kontrast-lang \
kontrast-lang-all \
locale-kontrast-ca \
locale-kontrast-ca@valencia \
locale-kontrast-cs \
locale-kontrast-da \
locale-kontrast-de \
locale-kontrast-el \
locale-kontrast-en-GB \
locale-kontrast-es \
locale-kontrast-eu \
locale-kontrast-fi \
locale-kontrast-fr \
locale-kontrast-gl \
locale-kontrast-it \
locale-kontrast-ja \
locale-kontrast-ka \
locale-kontrast-ko \
locale-kontrast-lt \
locale-kontrast-nl \
locale-kontrast-nn \
locale-kontrast-pa \
locale-kontrast-pl \
locale-kontrast-pt \
locale-kontrast-pt-BR \
locale-kontrast-ru \
locale-kontrast-sk \
locale-kontrast-sl \
locale-kontrast-sv \
locale-kontrast-tr \
locale-kontrast-uk \
locale-kontrast-zh-CN \
locale-kontrast-zh-TW"

RDEPENDS:${PN} += "kontrast"

inherit rpm

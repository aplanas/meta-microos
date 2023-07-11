SUMMARY = "Translations for package hourglass"
DESCRIPTION = "Provides translations for the 'hourglass' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "hourglass-lang-2.0.2-1.11.noarch.rpm"
RPM_HASH = "b24f0137fdd604df4abb44aa3dde0e50d6b8e1b59ce6031a4d4a76da43b66e9f5ac4665c21243362092760c26bca653df41c9278a61dd62076785e90e9e7ecc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hourglass-lang \
hourglass-lang-all \
locale-hourglass-bs \
locale-hourglass-de \
locale-hourglass-es \
locale-hourglass-et \
locale-hourglass-fr \
locale-hourglass-it \
locale-hourglass-ja \
locale-hourglass-lt \
locale-hourglass-pt \
locale-hourglass-pt-BR \
locale-hourglass-ru \
locale-hourglass-sv \
locale-hourglass-tr"

RDEPENDS:${PN} += "hourglass"

inherit rpm

SUMMARY = "Translations for package calcurse"
DESCRIPTION = "Provides translations for the 'calcurse' package."
LICENSE = "BSD-2-Clause"

PV = "4.8.0"

RPM_NAME = "calcurse-lang-4.8.0-1.4.noarch.rpm"
RPM_HASH = "2587dd3d77af3aab63c064a43e3fd480800452c9d519a124a7124f3c3fe9fdbcc18857a20d06d22dd95ce2402a4b15a3ebac7075c5f88597d348add1c4276e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calcurse-lang \
calcurse-lang-all \
locale-calcurse-de \
locale-calcurse-en-US \
locale-calcurse-es \
locale-calcurse-fr \
locale-calcurse-nl \
locale-calcurse-pt-BR \
locale-calcurse-ru"

RDEPENDS:${PN} += "calcurse"

inherit rpm

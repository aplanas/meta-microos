SUMMARY = "Slovenian ispell dictionary"
DESCRIPTION = "This package includes a ready Slovenian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-slovene-1.5-422.6.aarch64.rpm"
RPM_HASH = "acc9fd4568ece7b6f9bb2f03534bae411ba20cd60d97ad31d7bdd7517df04bdce3363779df353117fcb7f2bd0463e9eff14716eb9656d9ba138e4c3347957d22"

RPROVIDES:${PN} += "islovene \
ispell-dictionary \
ispell-slovene \
locale-ispell-sl"

RDEPENDS:${PN} += ""

inherit rpm

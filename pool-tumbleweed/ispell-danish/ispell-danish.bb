SUMMARY = "Danish ispell dictionary"
DESCRIPTION = "This package includes a ready Danish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-danish-1.5-422.6.aarch64.rpm"
RPM_HASH = "6781665d0225fbb17a87ac8009304421ac3a00a3ba6346715b143a56a98e8a707ac0388977936420d2108821c9036d3294d2bf3b22311d40c132c7adbf6f3b9c"

RPROVIDES:${PN} += "idanish \
ispell-danish \
ispell-danish(aarch-64) \
ispell_dictionary \
locale(ispell:da)"

RDEPENDS:${PN} += ""

inherit rpm

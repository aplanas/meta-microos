SUMMARY = "Estonian ispell dictionary"
DESCRIPTION = "This package includes a ready Estonian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "ispell-estonian-1.5-422.6.aarch64.rpm"
RPM_HASH = "4eb213560fa7715fee4b3f9df0cfb6d8b3e3841af45969a81b45d2bd1a863913edc86249786fa95cb439839a091f3d8527710e1926a1e875ea6d50974ff26680"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-estonian \
locale-ispell-et"

RDEPENDS:${PN} += ""

inherit rpm

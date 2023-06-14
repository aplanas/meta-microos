SUMMARY = "Greek ispell dictionary"
DESCRIPTION = "This package includes a ready Greek dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-greek-1.5-422.6.aarch64.rpm"
RPM_HASH = "076bb4773c8521e407394357fe30b3071ca6bf3d3cd89bd6af8ccef6db82fee5851fd426fd87336d2e43667d83f1b7c513de14707743df8e986e5315386d18b8"

RPROVIDES:${PN} += "igreek \
ispell-dictionary \
ispell-greek \
locale-ispell-el"

RDEPENDS:${PN} += ""

inherit rpm

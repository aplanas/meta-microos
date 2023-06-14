SUMMARY = "French ispell dictionary"
DESCRIPTION = "This package includes a ready French dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-french-1.5-422.6.aarch64.rpm"
RPM_HASH = "c295d51b6094a08a6b94ab01c925c8798b1a3c973066dd8b22a4a1be5d9ce5525c6bc3f77386b0cba434880e0335f690d40836315d6a02c61d38581f2f960d91"

RPROVIDES:${PN} += "ifrench \
ispell-dictionary \
ispell-french \
locale-ispell-fr;br-FR"

RDEPENDS:${PN} += ""

inherit rpm

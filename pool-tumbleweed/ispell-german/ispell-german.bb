SUMMARY = "German ispell dictionary"
DESCRIPTION = "This package includes a ready German dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ispell-german-1.5-422.6.aarch64.rpm"
RPM_HASH = "160fc7c6d581edfd97322fce52b106085fe583aff5888a6077e0b60b895dc60ec92a275b6b9cce6b12e99e0064ed7b5c278ad13bf7404773012b2db4cc903e2e"

RPROVIDES:${PN} += "igerman \
ispell-german \
ispell-german(aarch-64) \
ispell_dictionary \
locale(ispell:de;de_DE)"
RDEPENDS:${PN} += ""

inherit rpm

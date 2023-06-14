SUMMARY = "Italian ispell dictionary"
DESCRIPTION = "This package includes a ready Italian dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-italian-1.5-422.6.aarch64.rpm"
RPM_HASH = "2545ca7e5173eb8160788ce30e02e78b481697c143651f4b6521d96a486ab753591aac5100c8bb7623782ce2e08cc9867f58937f331f3335d06c8b9945350be3"

RPROVIDES:${PN} += "iitalian \
ispell-dictionary \
ispell-italian \
locale-ispell-it"

RDEPENDS:${PN} += ""

inherit rpm

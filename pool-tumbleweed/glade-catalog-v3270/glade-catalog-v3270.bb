SUMMARY = "Glade catalog for the TN3270 terminal emulator library"
DESCRIPTION = "This package provides a catalog for Glade to allow the use of V3270 \
widgets in Glade."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "glade-catalog-v3270-5.4-1.10.aarch64.rpm"
RPM_HASH = "70604bad6f4ac80ad0e1f6fe8cc50fec4ba57a485e84961c18544fcd1f52d4c67e4ffe3d2526822307050d73b37ce7783fb390611f5354dad00a9b952a5ca038"

RPROVIDES:${PN} += "glade-catalog-v3270"

RDEPENDS:${PN} += "glade"

inherit rpm

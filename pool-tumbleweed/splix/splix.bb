SUMMARY = "Driver for Samsung Printer Language printers"
DESCRIPTION = "SpliX is a set of CUPS printer drivers for SPL (Samsung Printer \
Language) printers. Some Samsung, Xerox and Dell printers use that \
language."
LICENSE = "GPL-2.0"

PV = "2.0.0.315"

RPM_NAME = "splix-2.0.0.315-3.11.aarch64.rpm"
RPM_HASH = "053299191270e5b74b57a702b7d519e00ddee531cff655d06a9a46cd90233fa3dba4258998ee5ab1da2c0e3757a92bd95558119f21746abc4a8424b0d77a6ebb"

RPROVIDES:${PN} += "cups-drivers-splix \
splix"

RDEPENDS:${PN} += "/bin/sh \
cups \
ghostscript \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libjbig85.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

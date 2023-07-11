SUMMARY = "Cabinet file library and tool"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides gcab tool and its manuals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-1.5-1.6.aarch64.rpm"
RPM_HASH = "de3d6fe7a751ddceb51796abfed9fa6141b0e1367e49437d7b5e045d07137f84091a04f41db9ba1a7faeda98092668f56a7c23cea5d64c51874487967c623eb4"

RPROVIDES:${PN} += "gcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

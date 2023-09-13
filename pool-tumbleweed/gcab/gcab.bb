SUMMARY = "Cabinet file library and tool"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides gcab tool and its manuals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-1.6-1.1.aarch64.rpm"
RPM_HASH = "03b4300ee27b614d755a3785d5db8683f7e62620b4e0ad19f5855b9172a188ab352f0642fcf0d9b05501a36417722005e7135cd043b51ceebe8cfc6e55b7b237"

RPROVIDES:${PN} += "gcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcab-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

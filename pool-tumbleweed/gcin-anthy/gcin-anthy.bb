SUMMARY = "Gcin anthy module"
DESCRIPTION = "gcin anthy module, try this to input Japanese with libanthy"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-anthy-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "f9549b9c4c9e6232ec01473284be85571f1950cb84301da19137c6213680361788d37ade13a49724a8053960d24c5746c84ac98d2b7492a0942aecff719660fb"

RPROVIDES:${PN} += "gcin-anthy \
gcin-anthy-module"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libanthy.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

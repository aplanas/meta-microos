SUMMARY = "Library for creating and reading trace-cmd data files"
DESCRIPTION = "Library for creating and reading trace-cmd data files"
LICENSE = "LGPL-2.1-only"

PV = "1.3.1"

RPM_NAME = "libtracecmd1-1.3.1-2.4.aarch64.rpm"
RPM_HASH = "a2f8f9c7a515232e5b0e086bcf436a3bf057c675e4ff7391a7dbf2cda314c31e25db88ed8a3b276313136081d211debb991f00d65d89588f6aaffaef55b728d4"

RPROVIDES:${PN} += "libtracecmd.so.1 \
libtracecmd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libzstd.so.1"

inherit rpm

SUMMARY = "Cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides a system library to access cab files"
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libgcab-1_0-0-1.5-1.6.aarch64.rpm"
RPM_HASH = "2e70998f9c8502ba7b0744f52aa7c133b091d946bc4d9b1b8c9736e2f8e34a47ceb18f71ebf3f6eb974daa68b0f4383395afbe4bb708520cab0200e18babdd3b"

RPROVIDES:${PN} += "libgcab-1-0-0 \
libgcab-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libz.so.1"

inherit rpm

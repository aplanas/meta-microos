SUMMARY = "Library to inspect and build Windows Installer (.MSI) files"
DESCRIPTION = "libmsi is a port of (and a subset of) Wine's implementation of the Windows \
Installer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "libmsi0-0.102-1.1.aarch64.rpm"
RPM_HASH = "d6340033c82abe48c002707d25b3db2b816fa76838f3f5e923c951865b3d7299868cf8c396f01da924d7cc84a9da191ec42baffecf48143b751d90ba63559283"

RPROVIDES:${PN} += "libmsi.so.0 \
libmsi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm

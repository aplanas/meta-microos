SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-92.1.aarch64.rpm"
RPM_HASH = "f8a868079c0ad978259921e018fcbcc92a1631cee3d6f52f83e436b5a346e7c0ab470cc10f378a220393b76089d01638fa8490de8b79b6e72ee5afeeff31a97b"

RPROVIDES:${PN} += "libsynctex.so.2 \
libsynctex2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm

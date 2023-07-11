SUMMARY = "GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "libcob4-3.1.2-1.14.aarch64.rpm"
RPM_HASH = "ddb3fd8404f23b84b7fbdf324222af8818b2bf62e38c07266e82a75bddfaf0ff6518de0c850b6a2e95573677ce05da0ff8be5e11244e3664a632e6de3a69ce11"

RPROVIDES:${PN} += "libcob.so.4 \
libcob4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgmp.so.10 \
libjson-c.so.5 \
libncursesw.so.6 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm

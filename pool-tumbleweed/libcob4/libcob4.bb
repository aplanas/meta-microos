SUMMARY = "GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "libcob4-3.1.2-2.1.aarch64.rpm"
RPM_HASH = "af4ab2d8fdb57caf7994ef0991f2670de5de92692785f736e1dc81351b319df6804870c26ceabc8b73b301ee3f418ba64fa0e32aa4602238c840f62c822263c7"

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

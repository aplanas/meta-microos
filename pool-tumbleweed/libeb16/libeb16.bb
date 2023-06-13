SUMMARY = "C Library for Accessing CD-ROM Books - shared library"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "libeb16-4.4.3-3.28.aarch64.rpm"
RPM_HASH = "b1461b1610fbbdceefddbf603743bb626c77631c3f1f11603438922980c9bde2af41d571661f9b9fe2c1ab1d5f1dfe2d95eea034764a1f5132df9de00cc389d0"

RPROVIDES:${PN} += "libeb.so.16()(64bit) \
libeb16 \
libeb16(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm

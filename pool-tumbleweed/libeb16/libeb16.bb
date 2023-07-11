SUMMARY = "C Library for Accessing CD-ROM Books - shared library"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "libeb16-4.4.3-3.29.aarch64.rpm"
RPM_HASH = "c7ca62487dd1e55a6eb0b8d2a2961e89fd3505633eb770e32123464652dd3f77932eb6e65cec7e0a35630f97af822bddc88c13a61bd25fe7a4e553ea53bcf61d"

RPROVIDES:${PN} += "libeb.so.16 \
libeb16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm

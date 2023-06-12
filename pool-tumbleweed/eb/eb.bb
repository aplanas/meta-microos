SUMMARY = "C Library for Accessing CD-ROM Books"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-4.4.3-3.28.aarch64.rpm"
RPM_HASH = "5c2b44d57039438b222b6d3e79e13c78eda867a559cd05d79ff0f4d7ce65aa8041c3aeb4933eb2231fa987961e6a5e94f4f40fc61942140301ba313f77d94451"

RPROVIDES:${PN} += "config(eb) \
eb \
eb(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libeb.so.16()(64bit) \
libz.so.1()(64bit)"

inherit rpm

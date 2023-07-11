SUMMARY = "C Library for Accessing CD-ROM Books"
DESCRIPTION = "EB Library is a C library for accessing CD-ROM books.  It can be built \
on UNIX-based systems.	EB Library supports accessing CD-ROM books in \
EB, EBG, EBXA, EBXA-C, S-EBXA, and EPWING formats.  CD-ROM books in \
those formats are popular in Japan.  Because CD-ROM books themselves \
are based on the ISO 9660 format, you can mount the CDs in the same way \
as other ISO 9660 CDs."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-4.4.3-3.29.aarch64.rpm"
RPM_HASH = "b3854abaebc463c2e2cf0f9d77b7e21e417c02be7bed19065acadedb50479aafc2c729e455c154a65b08cc4a165aca589851b51f0dec59a2354b8f8985749c96"

RPROVIDES:${PN} += "config-eb \
eb"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeb.so.16 \
libz.so.1"

inherit rpm

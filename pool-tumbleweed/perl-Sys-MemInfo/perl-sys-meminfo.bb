SUMMARY = "Query the total free and used physical memory"
DESCRIPTION = "Sys::MemInfo return the total amount of free and used physical memory in \
bytes in totalmem and freemem variables. \
 \
Total amount of free and user swap memory are alse returned in totalswap \
and freeswap variables. \
 \
This module has been tested on Linux 3.13.0, UnixWare 7.1.2, AIX5, OpenBSD \
3.8, NetBSD 2.0.2, FreBSD 5.4, HPUX11, Solaris 9, Tru64 5.1, Irix 6.5, Mac \
OS X 10.2 darwin and Windows XP. \
 \
It should work on FreeBSD 4 and Windows 9X/ME/NT/200X/Vista."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.99"

RPM_NAME = "perl-Sys-MemInfo-0.99-1.15.aarch64.rpm"
RPM_HASH = "862fd5adbe68c5e775f220864e38e421c0403fe1bd08b422c015dd0c8ae245405c581d61779b25be6fefdea4b2c2ec8c24f2bf1a4ac53e5e4040a7d936974867"

RPROVIDES:${PN} += "perl-Sys--MemInfo \
perl-Sys-MemInfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

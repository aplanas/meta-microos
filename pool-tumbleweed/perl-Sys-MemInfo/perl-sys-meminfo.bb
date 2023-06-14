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

RPM_NAME = "perl-Sys-MemInfo-0.99-1.13.aarch64.rpm"
RPM_HASH = "9e4c4366954b08724b43c13332e1730f5e7a7af3558d7d10f95d767032fa989d4ba977ed66864260876280411525d5b7f23ae6ab4aab350f6e97328fd5a450e9"

RPROVIDES:${PN} += "perl-Sys--MemInfo \
perl-Sys-MemInfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm

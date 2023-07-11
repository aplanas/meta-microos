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

RPM_NAME = "perl-Sys-MemInfo-0.99-1.14.aarch64.rpm"
RPM_HASH = "4f7581fc1553df78ac2796c63032b3153744701110ef20bf3622a9cfd1db65099c8efbf0ccb0fa38fa32b38fcaa8526ccaf15116c60cd92445194ad9874b5232"

RPROVIDES:${PN} += "perl-Sys--MemInfo \
perl-Sys-MemInfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

SUMMARY = "Disk-Based Hash Library"
DESCRIPTION = "Disk-based hashes is a method to create multidimensional binary trees \
on disk. This library permits the extension of the database concept to \
a plethora of electronic data, such as graphic information. With the \
multidimensional binary tree, it is possible to mathematically prove \
that access time to any particular record is minimized (using the \
concept of critical points from calculus), which provides the means to \
construct optimized databases for particular applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.22"

RPM_NAME = "libdbh2-5.0.22-1.15.aarch64.rpm"
RPM_HASH = "df2c5d8b97e1d69125420ce3a9e16939ce6c9658a98a5d5cc2e0716554405f0bbe55a3f94ea691449208bc843f192b9d66eb87c6e718377da6961e428b604962"

RPROVIDES:${PN} += "dbh \
libdbh.so.2()(64bit) \
libdbh2 \
libdbh2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

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

RPM_NAME = "libdbh2-5.0.22-1.16.aarch64.rpm"
RPM_HASH = "972b1a5de6560951797602c44bac56230e05fcba8a96f2561d117b1252457ea6d3c6d9319d9e44532cf5dad0027c7d6978243c7610c9122e3722d70b47a88972"

RPROVIDES:${PN} += "dbh \
libdbh.so.2 \
libdbh2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm

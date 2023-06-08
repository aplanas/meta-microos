SUMMARY = "Development files for the Disk-Based Hash Library"
DESCRIPTION = "Disk-based hashes is a method to create multidimensional binary trees \
on disk. This library permits the extension of the database concept to \
a plethora of electronic data, such as graphic information. With the \
multidimensional binary tree, it is possible to mathematically prove \
that access time to any particular record is minimized (using the \
concept of critical points from calculus), which provides the means to \
construct optimized databases for particular applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.22"

RPM_NAME = "dbh-devel-5.0.22-1.15.aarch64.rpm"
RPM_HASH = "d1998e533ede778f7259d499609446726491de9d992825a009be0978dff92db0a3a7db21d452d244b4cf0ee717997e9f19e92923aed0f7d2779665363123cbe0"

RPROVIDES:${PN} += "dbh-devel dbh-devel(aarch-64) pkgconfig(dbh2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdbh2"

inherit rpm

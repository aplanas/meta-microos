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

RPM_NAME = "dbh-devel-5.0.22-1.16.aarch64.rpm"
RPM_HASH = "57c1fdbefdc63a9bed75caf353e8659351ade24518b3b46386a38405b1c8fab32087746f5b30a6ba701f4f16c1f2e8adc0218a38ffce63202ea783b26489ac7c"

RPROVIDES:${PN} += "dbh-devel \
pkgconfig-dbh2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbh2"

inherit rpm

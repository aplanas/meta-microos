SUMMARY = "Development headers and libraries for libquo"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively. \
 \
This package contains development headers and libraries for libquo."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libquo-devel-1.3.1-2.10.aarch64.rpm"
RPM_HASH = "5bce1ff456e7d4aafba4e8157fe083a90922781bc53fd7c144076022a9bfbd712c6a83c7e7aaff1caf6aef9b036502fee0eaff4adfba92b918f4290fe3ef61ad"

RPROVIDES:${PN} += "libquo-devel \
pkgconfig-libquo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libquo7"

inherit rpm

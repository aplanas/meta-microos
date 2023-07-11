SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "This Package contains necessary files for development and building PMI-X \
aware applications."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-devel-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "204d7eb25b37e50c83e5cb98a5ac5ad384d875639a35538b41aa3068834061ccbbc6af2393740e3adb94ccdb8967e99195553a0c034ae3b1e5def93b575a31c9"

RPROVIDES:${PN} += "pkgconfig-pmix \
pmix-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmca-common-dstore1 \
libpmix2 \
pkgconfig-hwloc \
pkgconfig-libevent \
pkgconfig-zlib \
pmix-headers"

inherit rpm

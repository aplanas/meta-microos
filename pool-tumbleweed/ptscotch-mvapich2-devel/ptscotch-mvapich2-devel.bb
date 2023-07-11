SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "458628e4173cd92ba0ee5cb4d83a15f5fae4a4da85a34e0a24b4a268a49b0ec1981c19feefce18a6944d1ed740c8880ef7a4c1032f295354d7e57c2b7d913c9d"

RPROVIDES:${PN} += "ptscotch-mvapich2-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-mvapich2 \
mvapich2-devel \
scotch-devel"

inherit rpm

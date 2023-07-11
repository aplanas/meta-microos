SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "0487616faf588b7f1fd12c6029c413c12a5f673809363f16bc3c19b2390fd77a65b9319403eecb2b0a9edd9e7d0a7547fa5e66eabf9b986a1c2a469056347f21"

RPROVIDES:${PN} += "ptscotch-mvapich2-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-mvapich2-devel"

inherit rpm

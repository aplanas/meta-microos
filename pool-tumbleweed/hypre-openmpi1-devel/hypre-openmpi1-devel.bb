SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi1"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi1-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "f60832008c30beb0109364e75c7ff51c63b5b851e5df49ec3674e7c422106fd68349b561a1659de53fd4be5a2bb6402662786e6ea752b8f346e15bb7d9c2a139"

RPROVIDES:${PN} += "hypre-openmpi1-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-openmpi1 \
superlu-devel"

inherit rpm

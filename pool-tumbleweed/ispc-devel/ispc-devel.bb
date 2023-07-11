SUMMARY = "Development files for ispc"
DESCRIPTION = "This package contains the C++ header, symbolic links to the shared \
libraries and cmake files for ispc.  If you would like to develop \
programs using ispc, you will need to install ispc-devel."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "ispc-devel-1.18.1-2.2.aarch64.rpm"
RPM_HASH = "34ec41c1c036be88cb45c0713c5adf94a3751e6a743c6bb5b2f18165adaaf057fad2440e27b0a1843df4c38cf0d2984ee16aedcf5fe9f4abbe2b70630bb9eaa1"

RPROVIDES:${PN} += "cmake-ispcrt \
ispc-devel"

RDEPENDS:${PN} += "ispc \
libispcrt1"

inherit rpm

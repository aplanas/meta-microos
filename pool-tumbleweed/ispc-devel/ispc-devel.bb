SUMMARY = "Development files for ispc"
DESCRIPTION = "This package contains the C++ header, symbolic links to the shared \
libraries and cmake files for ispc.  If you would like to develop \
programs using ispc, you will need to install ispc-devel."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "ispc-devel-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "86ae0a996ca9333d307e7cba6575840f2a2dc8b149e3e1f3222c33b569dd7b05d40a4a31c93abd44cff98dc2418086f92318de7f7ab308f172c094de9d74b5d7"

RPROVIDES:${PN} += "cmake-ispcrt \
ispc-devel"

RDEPENDS:${PN} += "ispc \
libispcrt1"

inherit rpm

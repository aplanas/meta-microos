SUMMARY = "Development files for the libdat and libdapl libraries"
DESCRIPTION = "Library links and header files for the libdat and libdapl libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-devel-2.1.10-5.1.aarch64.rpm"
RPM_HASH = "b57ca029a0f945955344517670d0d5659c8b263d78ba8a053863c1e6bf653c377b28e86a333aef80d82f29272a8f7c327b3b302366c0a658f3b3d0130dc859e5"

RPROVIDES:${PN} += "dapl-devel \
dapl-devel(aarch-64)"

RDEPENDS:${PN} += "dapl \
glibc-devel"

inherit rpm

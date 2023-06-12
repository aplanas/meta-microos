SUMMARY = "Development files for libcint"
DESCRIPTION = "The libcint-devel package contains libraries and header files for \
developing applications that use libcint."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "cint-devel-4.4.1-1.9.aarch64.rpm"
RPM_HASH = "21e15dc11131f5bc19b6c8f677c6c64a3d59f6bbca0a902b4737d956214e921bffcafe016828245a5b717293898b3b3d15f92ebb66cfe7ed0ed955f7b1728265"

RPROVIDES:${PN} += "cint-devel \
cint-devel(aarch-64)"
RDEPENDS:${PN} += "libcint4"

inherit rpm

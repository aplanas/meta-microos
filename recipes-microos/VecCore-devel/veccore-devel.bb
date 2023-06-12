SUMMARY = "Headers and cmake modules for VecCore"
DESCRIPTION = "VecCore is a simple abstraction layer on top of other vectorization libraries. \
 \
This package provides the headers and cmake modules for VecCore."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "VecCore-devel-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "c95ee1d16bd3f2a08aa7ad2d575f5c404ef233c6834a27e17c26ae1113a68c5cecfdabaa900ddd473582c07926e0bf13c3e775ba66ba854cb4a68ba58cc58d29"

RPROVIDES:${PN} += "VecCore-devel \
VecCore-devel(aarch-64) \
cmake(VecCore)"
RDEPENDS:${PN} += ""

inherit rpm

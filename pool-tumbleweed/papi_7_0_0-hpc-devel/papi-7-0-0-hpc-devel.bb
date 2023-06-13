SUMMARY = "Software Development Kit for PAPI"
DESCRIPTION = "This package includes the C header files that specify the PAPI userspace \
libraries and interfaces. This is required for rebuilding any program \
that uses PAPI."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-devel-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "40b5b0557e2921c1dd5492a777b2d727a485b2bdaea4a88c73b3c22c3268e66565dfbf4a83b06032ae06c2a3366ad004f06d14b75d5620d0ac40b1cb948ee04c"

RPROVIDES:${PN} += "papi_7_0_0-hpc-devel \
papi_7_0_0-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpapi_7_0_0-hpc \
libpfm.so.4()(64bit) \
linux-kernel-headers \
papi_7_0_0-hpc"

inherit rpm

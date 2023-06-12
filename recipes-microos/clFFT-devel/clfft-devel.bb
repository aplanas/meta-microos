SUMMARY = "Development files for libclfft"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libclFFT."
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "clFFT-devel-2.12.2-6.8.aarch64.rpm"
RPM_HASH = "cea52bd69d04fb67e598b5f282befad5fd046f94aad71f390f0df23c9e4b5a3322cc01945c0b1c78486cdef3ba4c15aaa56cb4b541fe0abf2ccc50467a8f665d"

RPROVIDES:${PN} += "clFFT-devel \
clFFT-devel(aarch-64) \
cmake(clFFT) \
pkgconfig(clFFT)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libStatTimer2 \
libclFFT2 \
opencl-headers \
pkgconfig(OpenCL)"

inherit rpm

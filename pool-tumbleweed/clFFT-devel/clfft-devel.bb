SUMMARY = "Development files for libclfft"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libclFFT."
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "clFFT-devel-2.12.2-6.9.aarch64.rpm"
RPM_HASH = "7fe312305de4160fd4cc16f3d7a21a61b1bde28a6d8e9df1f351520207178126140f1977d3cee106fa3cf3343d33177038ca042daf744d0a96ca4f8e8bf74f1d"

RPROVIDES:${PN} += "clFFT-devel \
cmake-clFFT \
pkgconfig-clFFT"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libStatTimer2 \
libclFFT2 \
opencl-headers \
pkgconfig-OpenCL"

inherit rpm

SUMMARY = "Shared Library part of pocl"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage contains the shared library part of pocl."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "libpocl2-3.1-3.2.aarch64.rpm"
RPM_HASH = "716b893bfdee51ff1c0039c08bfef2415b069142b4e80d8a5e208594704012525c8b5c7dd049ea4e8dc7cec660f34bf943c5e3bd57a96959cb9deb3000ad6d6f"

RPROVIDES:${PN} += "libpocl.so.2 \
libpocl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libgcc-s.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm

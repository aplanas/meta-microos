SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libomp13-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "bccf9d5a3cee9633238f5fedfeb6a87dab1dbb979d05f9b3d6ec965455a71705403b861cff0f44d68cb96a861a5ed1517a3d638d047a6eb065f04d5dd24d1c73"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp13-devel \
libomptarget.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

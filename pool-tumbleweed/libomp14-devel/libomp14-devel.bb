SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libomp14-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "d5674bd6d092c64f456410d1f80f467eb6364d8cb76f8e4bbda068ba8133c01536652cc0b68f842ccb526101a779f4311b474f6156c1131dbe9b1091e4b254b6"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp14-devel \
libompd.so \
libomptarget.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

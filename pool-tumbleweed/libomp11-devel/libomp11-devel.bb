SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libomp11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "326f6171e41acfa14d49b5612fedc8bd3a219b942a563120e6fdebf3ae946035ba956c946af9ecd5f7cadccc81862e5302adedb44613ddda82e8150d848fd3ea"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp11-devel \
libomptarget.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM11 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libomp11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "326f6171e41acfa14d49b5612fedc8bd3a219b942a563120e6fdebf3ae946035ba956c946af9ecd5f7cadccc81862e5302adedb44613ddda82e8150d848fd3ea"

RPROVIDES:${PN} += "libarcher.so()(64bit) \
libomp-devel \
libomp.so()(64bit) \
libomp.so(VERSION)(64bit) \
libomp11-devel \
libomp11-devel(aarch-64) \
libomptarget.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM11 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

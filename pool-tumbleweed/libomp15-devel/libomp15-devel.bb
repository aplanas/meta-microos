SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libomp15-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "2a15abe220884a253082762d47d2b6e1b9636f7458fa95187e112e203b8f0e673c34e11ad1a71d4c89247508a9b4ae851ec3d7198917a4872d95db28f3628cda"

RPROVIDES:${PN} += "libarcher.so()(64bit) \
libomp-devel \
libomp.so()(64bit) \
libomp.so(VERSION)(64bit) \
libomp15-devel \
libomp15-devel(aarch-64) \
libompd.so()(64bit) \
libomptarget.so.15()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

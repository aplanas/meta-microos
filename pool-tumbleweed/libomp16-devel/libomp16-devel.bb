SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libomp16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "a1caf4b6d2146f9e0e97c1f0ee0713e7e126e71454fc0b8417985cb86a1ae468819e8a500c89a13a6983171ef680511b842c61eadca67b10d89e3f68ec46f67a"

RPROVIDES:${PN} += "libarcher.so()(64bit) \
libomp-devel \
libomp.so()(64bit) \
libomp.so(VERSION)(64bit) \
libomp16-devel \
libomp16-devel(aarch-64) \
libompd.so()(64bit) \
libomptarget.rtl.aarch64.nextgen.so.16()(64bit) \
libomptarget.rtl.aarch64.so.16()(64bit) \
libomptarget.rtl.amdgpu.nextgen.so.16()(64bit) \
libomptarget.rtl.amdgpu.so.16()(64bit) \
libomptarget.rtl.cuda.nextgen.so.16()(64bit) \
libomptarget.rtl.cuda.so.16()(64bit) \
libomptarget.so.16()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm

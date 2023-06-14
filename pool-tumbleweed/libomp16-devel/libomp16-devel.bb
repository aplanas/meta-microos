SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libomp16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "a1caf4b6d2146f9e0e97c1f0ee0713e7e126e71454fc0b8417985cb86a1ae468819e8a500c89a13a6983171ef680511b842c61eadca67b10d89e3f68ec46f67a"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp16-devel \
libompd.so \
libomptarget.rtl.aarch64.nextgen.so.16 \
libomptarget.rtl.aarch64.so.16 \
libomptarget.rtl.amdgpu.nextgen.so.16 \
libomptarget.rtl.amdgpu.so.16 \
libomptarget.rtl.cuda.nextgen.so.16 \
libomptarget.rtl.cuda.so.16 \
libomptarget.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libffi.so.8 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm

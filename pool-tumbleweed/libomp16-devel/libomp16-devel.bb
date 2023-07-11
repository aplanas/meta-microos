SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libomp16-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "d348d6fa431099945a45b1d9422da0ec80a23587137814086915b60ef4c5d66d2550afbd694c6fea1dc06a4a68ff7f71633f191ebb74370e8095ae81d7ce99fb"

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

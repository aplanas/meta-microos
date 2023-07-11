SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libomp14-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "929b0d832216a923c9bf3f605309212c6efd396d9d4144cbd59dc65cf89ec6933ee346cf48fe8da87be72894d8b0520b551d886b7ddc76efd27077c6db7d1925"

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

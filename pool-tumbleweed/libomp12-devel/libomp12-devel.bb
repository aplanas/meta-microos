SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "libomp12-devel-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "ea33c142dc67a2f8f121439d3bb1de4d9dc63db5046df77b6fda060b099ae6085edb3629aadbef8983dd8d8aa4e368d7f47337779dd68eee5b41185eb775f92a"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp12-devel \
libomptarget.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM12 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

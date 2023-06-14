SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libomp13-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "0e8d0823d4b6091c54c83a86ef8be6314fe0bc4f9ab0aa8816225850280898a4cf019b7e32c5f8d2b7a733b6a6b9d2f4f644032dfef7fd74a37b76b210562b0d"

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

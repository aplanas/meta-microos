SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libomp15-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "ccfdad2e690114a73972c1ae6d8ea977b1c866463299a7e63c0fadd8f83527b39daa0e85ad3e350f26a0fce8db49e3fddedd379c053314f6fac409c024ca1d7b"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel \
libomp.so \
libomp15-devel \
libompd.so \
libomptarget.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

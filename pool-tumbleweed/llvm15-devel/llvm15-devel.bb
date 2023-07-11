SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "e87b933e989281f4be65fa487a4c5076ccb3856049c1ce3b4bdcd7339a8ab4dcd2485668dbbc8dc65cf9204e7a52f3088d60d79692644b549a555f911a64d71c"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm15-devel \
rpm-macro--libclang-sonum \
rpm-macro--libcxx-sonum \
rpm-macro--llvm-minorver \
rpm-macro--llvm-relver \
rpm-macro--llvm-sonum \
rpm-macro--llvm-version \
rpm-macro--llvm-with-ffi \
rpm-macro--llvm-with-libcxx \
rpm-macro--llvm-with-lldb \
rpm-macro--llvm-with-openmp \
rpm-macro--llvm-with-oprofile \
rpm-macro--llvm-with-valgrind"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM15 \
libLTO15 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp15-devel \
libstdc++-devel \
libstdc++.so.6 \
libtool \
llvm15 \
llvm15-gold \
llvm15-polly-devel \
pkgconfig"

inherit rpm

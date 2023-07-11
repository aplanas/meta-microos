SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "e0b8ce1030ab1ba09103e87b2650c2787c6771c316bb4818c288e4e30a41e87359f2247375465203586b6c7ef48b8efeeb107566da105aec33173f59dc3602c2"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm13-LTO-devel \
llvm13-devel \
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
libLLVM.so.13 \
libLLVM13 \
libLTO13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp13-devel \
libstdc++-devel \
libstdc++.so.6 \
libtool \
llvm13 \
llvm13-gold \
llvm13-polly-devel \
pkgconfig"

inherit rpm

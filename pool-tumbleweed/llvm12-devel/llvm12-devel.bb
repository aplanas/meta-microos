SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-devel-12.0.1-12.1.aarch64.rpm"
RPM_HASH = "39501a8385a3b9d1f122de5a5fac2c4f6b2d735fe64c5de7cedd35c2696b0ee568d27bfe279bba076776a0234c730bf02bf5d2a67be78ecb489c8c316a7a8c4b"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
llvm-devel-provider \
llvm12-devel \
rpm-macro--libcxx-sonum \
rpm-macro--llvm-minorver \
rpm-macro--llvm-relver \
rpm-macro--llvm-sonum \
rpm-macro--llvm-version \
rpm-macro--llvm-with-clang-scripts \
rpm-macro--llvm-with-ffi \
rpm-macro--llvm-with-libcxx \
rpm-macro--llvm-with-lldb \
rpm-macro--llvm-with-openmp \
rpm-macro--llvm-with-oprofile \
rpm-macro--llvm-with-valgrind"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.12 \
libc.so.6 \
libomp12-devel \
libstdc++-devel \
libstdc++.so.6 \
libtool \
llvm12 \
llvm12-LTO-devel \
llvm12-gold \
llvm12-polly-devel \
pkgconfig"

inherit rpm

SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "862413e64bf3fb183b1dd7ae991d589028ea6c0fc2594569daeef4684101c9e0789206d4dfb33e54d5f3bc2c27f8923b568dfb8d05c973a5ebc5c6e5430500d4"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm14-devel \
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
libLLVM14 \
libLTO14 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp14-devel \
libstdc++-devel \
libstdc++.so.6 \
libtool \
llvm14 \
llvm14-gold \
llvm14-polly-devel \
pkgconfig"

inherit rpm

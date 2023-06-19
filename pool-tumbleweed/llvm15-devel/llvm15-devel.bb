SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "696bc792b8713041127d74cc2e8a71aeda586518e81a5cfdba20273207339ec95cac2565d44677a4ef01a59ca17022c71d10ff58e66ad2115ff09fcab21d6fd0"

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

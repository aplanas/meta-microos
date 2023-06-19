SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "157950e9aff7534f058e0ba3da7431da593f9931b63e1a49f838b20fce5119df2396ffa88c587436cd4020859c4918f0ef175df87d4e9918054156cd68f6c185"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm16-devel \
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
libLLVM16 \
libLTO16 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp16-devel \
libstdc++-devel \
libstdc++.so.6 \
libtinfo.so.6 \
libtool \
llvm16 \
llvm16-gold \
llvm16-polly-devel \
pkgconfig"

inherit rpm

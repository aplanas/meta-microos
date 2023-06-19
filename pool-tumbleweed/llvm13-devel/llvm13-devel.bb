SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "623b8380904882b0a635efb146cd48b9cb511fe84d8eaa93fdc25223bdd04b758ab5bc57b848c592dd414155f3e3d12e1f1c1601c6aadf52b191ad76a7945e83"

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

SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-devel-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "1a2b29f934e65d8e17a8dc25944b52de7c5bca2b9ed37907c1be652c87e797ed245ae7d5ada65f2c1352410399fb15ccc11b675d723868b4bad46ca7cf830f7d"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
llvm-devel-provider \
llvm11-devel \
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
libLLVM.so.11 \
libc.so.6 \
libstdc++-devel \
libstdc++.so.6 \
libtool \
llvm11 \
llvm11-LTO-devel \
llvm11-gold \
llvm11-polly-devel \
pkgconfig"

inherit rpm

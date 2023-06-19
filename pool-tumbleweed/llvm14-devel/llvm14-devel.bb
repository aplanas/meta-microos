SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "f987e99503a0c392dc8b8a2a2a8e32b8339a08a7fa302c4dbbbce04a71c441b062560316e2597dbbb4fe8dd47dc870583c7f876402bb9b130d4327bd8430d139"

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

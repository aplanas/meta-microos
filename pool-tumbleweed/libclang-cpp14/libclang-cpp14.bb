SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libclang-cpp14-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "d2b6b58b68ef49f98cc5d24e7cabc66de2fda7239f02fb2238a14bfca4b9c35e4fc21aaec7ca22e15c3e34f6aeb38fa7165d6354d884b93acb8400e10488d348"

RPROVIDES:${PN} += "libclang-cpp.so.14 \
libclang-cpp14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

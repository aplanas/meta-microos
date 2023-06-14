SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libclang-cpp16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "e2734fcb50635c12e3b25d884977ea9379be91f4d49d5b668458eef20a19c2c85ce657a4fd33da3418a7367fbb13c781cef58b7f87afb17cb3787b34f220894d"

RPROVIDES:${PN} += "libclang-cpp.so.16 \
libclang-cpp16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

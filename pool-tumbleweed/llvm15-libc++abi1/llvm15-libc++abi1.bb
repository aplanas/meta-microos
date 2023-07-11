SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++abi1-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "5fcfd3c5bca92a9e16e8da915bea633c7207a536821547413f42223f1f5975a14592df4a60404c28033d4e44ab3ae0ffd8b431366c3a6d777c286bbc65c7dc86"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm15-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

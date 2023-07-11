SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi1-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "9cec947f883f377772a47152c1a3faf6b019c80a5bd2ff2f730f676d5cb33f9760440e5eba6a317e6fae79a4b69ea7fba4111956a7145f96142d7520d5754fec"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm13-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

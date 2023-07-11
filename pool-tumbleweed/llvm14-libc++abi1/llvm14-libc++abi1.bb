SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi1-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "f71e5b94927a1fd58393fa30ddff4d0dfa2e33794f0b91036b114496e0cdfdd6d8edd47a28a5baa553fe2aeb2cf7a86d763af79f5401c73d73f47b15ee899638"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm14-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

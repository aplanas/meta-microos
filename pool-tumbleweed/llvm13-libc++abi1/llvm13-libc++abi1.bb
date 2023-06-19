SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi1-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "fa1fbc1f1b64f7b09bf775fdd5ab82d010f423db893154fdd518555c027b341b2ca3003237fe918556604f547afbf84dd3fea50bb43c3042342f2fb996f741bf"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm13-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

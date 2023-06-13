SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libc++abi1-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "63ea9beb0362d4ba6149ac6e78861e1d6b995905daeae0009d8f312483874ba8c6657112c4d35792559119f3764d9b9d59c647c28b3d42a182ebfd6c12bcbfab"

RPROVIDES:${PN} += "libc++abi.so.1()(64bit) \
libc++abi1 \
libc++abi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm

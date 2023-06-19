SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++1-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "9e032b93bffb761e0a2bb0a6d4d7deaec9f2230df2a6657ac4d128f9a31c338ad46abcc7229705d9d59b46be6f5d75816f67f685539ed0c29f7c15a38c354c58"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm15-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

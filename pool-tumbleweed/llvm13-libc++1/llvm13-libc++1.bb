SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++1-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "0e6c8a5f4ca0ec60b11d09f205e44ae136af099d3a11e625de9fb69a2a50adb91736cb5839d1177bfeadab1c8dcf35e433d58747424be500403b780ee1a28679"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm13-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

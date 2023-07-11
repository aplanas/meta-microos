SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libc++-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "c60f3d65fcfd1b9df480981574dca098286f364d57f732a6cf17618a0462fbd467662f255575b6129e73cb7b945aab6f3feca8c1a545c6dd29e026d57d52dbec"

RPROVIDES:${PN} += "libc++-devel \
libc++.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm

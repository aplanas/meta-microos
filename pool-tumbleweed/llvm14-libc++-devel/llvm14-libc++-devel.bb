SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "674ddeed15a879eab06c5b213e19577361519c576f9b57f100d8947610a0201f8cdad0ea4e99f99eb51be6ddcef79cee30b0ca9e7a06d10286f75393a0c612c4"

RPROVIDES:${PN} += "libc++.so \
llvm14-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm

SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libc++abi-devel-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "4e733d58225fb33d5748fc79cedf758f0fb5c7d100d4debe10f747c86ad712d5fb957741cf79f0aa2e63591b7297c2dc857f7b0489093ae2762196eaa73b71d4"

RPROVIDES:${PN} += "libc++abi-devel \
libc++abi.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm

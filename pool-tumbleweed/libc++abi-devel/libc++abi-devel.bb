SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libc++abi-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "0df33cf11c17f6b7d640500db4c10ed367014b9650f8846cd540c0a1cc5c4b85a84e89c12850619bb49a1c767fbabd41f9ca92cb04c705c6f2ad02929f2af41d"

RPROVIDES:${PN} += "libc++abi-devel \
libc++abi-devel(aarch-64) \
libc++abi.so"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm

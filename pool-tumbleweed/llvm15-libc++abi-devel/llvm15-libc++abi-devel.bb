SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++abi-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "a2c432542306184be4d89118dbea272dbf02322eb64cc816ccfd0030ea0eafbf8b4746b0a9ce124e498df41a646e19cbe319611f1d0d60c66e526e3b00d8d3ee"

RPROVIDES:${PN} += "libc++abi.so \
llvm15-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm

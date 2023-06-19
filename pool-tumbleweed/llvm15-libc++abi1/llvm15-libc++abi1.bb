SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++abi1-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "3d6db9ab2c9e34c784b4916cff867407e01fbd063131834edbf54ff48c870474892c50245e03707d75e15fb7e98c207f7ec94352f30fa1e9d416eef9b6ee082f"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm15-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

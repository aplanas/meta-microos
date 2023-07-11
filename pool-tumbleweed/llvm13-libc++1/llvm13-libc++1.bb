SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++1-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "8eef99767c932f16975d55348fd4efd086741522b3cedec079bbe5b8c126540d71d6b61660e437b24742491d08ed9942dc3bf9bd128af3425a396e46d550ce79"

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

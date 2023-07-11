SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libc++1-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "bb8509b77133e510de9f026a0f4650620f6abea5095517e1a1ff50f5c6b0504fd3ccc02f69b123e5fb629a20299403825eba4f19a916202be18e9dfaad504411"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

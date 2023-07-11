SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libc++abi1-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "8122f1c308c6b1d731b7ace0c5aa1989a01236ae0be8993e340e81b0d9c51d5efb6d91b27e16f4187cb0125ccd9112793fe5980f376e30bf956b2c3f14c7af27"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm

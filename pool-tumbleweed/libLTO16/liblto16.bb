SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "libLTO16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "8caf08df91f21c733be07348e5ab1151381174d1ded6a96de2bce89545f056aa1747e2cbfe95f4655fbd657a754ecf9d4a572a0f2c2c98ed750222565d8a0fb4"

RPROVIDES:${PN} += "libLTO.so.16 \
libLTO16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

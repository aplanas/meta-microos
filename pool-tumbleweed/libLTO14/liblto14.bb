SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLTO14-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "38c53821d67538062c66b527cbc1962a3efa8d9f38c5ed6e520cca0cab8a15398ae629d596e0ddcb9b2f662bdb882ec1b919b10e85d67c6b2affbd6270d3af6c"

RPROVIDES:${PN} += "libLTO.so.14 \
libLTO14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libLTO16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "f379cbca3a2b5cc5ed5bce248b2e6afb2f48350105c4a1bdc5d11372d3aa68c9e8539ce212e4b5dec863fa55e4dd5a09b8bc01e0dc9a956f1b4a6a6e85d1bfd3"

RPROVIDES:${PN} += "libLTO.so.16 \
libLTO16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

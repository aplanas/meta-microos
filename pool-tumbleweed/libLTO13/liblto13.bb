SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libLTO13-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "affbba527d89b803ddf8fb343736a5704ff0c6c2d5faacba71af2dfe6d78211f699fa0815a0539a26fd1b50071c97547d93b25c47280717acd0ba7e043c82eaa"

RPROVIDES:${PN} += "libLTO.so.13 \
libLTO13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

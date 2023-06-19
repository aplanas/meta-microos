SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libLLVM16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "89f0fb6d990eff839d185a07c1262a3927ed468332207ac28464a635f6649da512d76f14ebaa827f353b7d73b73b3dbf2792fa494398a21c0282bc5d072074ef"

RPROVIDES:${PN} += "libLLVM.so.16 \
libLLVM16 \
libLLVMTableGen.so.16 \
libRemarks.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm

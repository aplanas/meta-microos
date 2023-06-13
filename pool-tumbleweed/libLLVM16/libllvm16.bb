SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libLLVM16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "89f0fb6d990eff839d185a07c1262a3927ed468332207ac28464a635f6649da512d76f14ebaa827f353b7d73b73b3dbf2792fa494398a21c0282bc5d072074ef"

RPROVIDES:${PN} += "libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libLLVM16 \
libLLVM16(aarch-64) \
libLLVMTableGen.so.16()(64bit) \
libRemarks.so.16()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm

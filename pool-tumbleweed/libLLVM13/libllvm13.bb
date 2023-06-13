SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "libLLVM13-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "a28d752fd14ce85def057ef517083795d725409c0ed6d6e7ea4eebb57f0f3e8808f4103fba1346b4c34a76c306a6317b8366fa849150f4726f3e1a87aefda1d7"

RPROVIDES:${PN} += "libLLVM.so.13()(64bit) \
libLLVM.so.13(LLVM_13)(64bit) \
libLLVM13 \
libLLVM13(aarch-64) \
libLLVMTableGen.so.13()(64bit) \
libRemarks.so.13()(64bit) \
libRemarks.so.13(LLVM_13)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm

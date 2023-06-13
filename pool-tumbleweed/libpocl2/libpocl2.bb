SUMMARY = "Shared Library part of pocl"
DESCRIPTION = "Portable Computing Language (pocl) is an implementation of the OpenCL standard \
which can be adapted for new targets and devices, both for homogeneous CPU and \
heterogenous GPUs/accelerators. \
 \
This subpackage contains the shared library part of pocl."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "libpocl2-3.1-3.1.aarch64.rpm"
RPM_HASH = "e000936420b1c9695227366dbe717f46f1f6ba69a49d468b609b9aaf953b1b1410f0eeac02dec88d3babf52aea617a5fbde6ed3fa0de15eaa53c5b1d6fb596a1"

RPROVIDES:${PN} += "libpocl.so.2()(64bit) \
libpocl2 \
libpocl2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libgcc_s.so.1()(64bit) \
libhwloc.so.15()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

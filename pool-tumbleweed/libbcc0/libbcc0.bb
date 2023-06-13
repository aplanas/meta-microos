SUMMARY = "Shared library from the BPF Compiler Collection"
DESCRIPTION = "Shared Library from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "libbcc0-0.26.0-2.10.aarch64.rpm"
RPM_HASH = "5e227b157c878b49ef4d8f2f9f8c39e32b33ee4a50938016523743014c4226e56f05ae5c2aa16d843811cf255b5a78d94af03bd4d87d926d8a37c664cbe33997"

RPROVIDES:${PN} += "libbcc.so.0()(64bit) \
libbcc0 \
libbcc0(aarch-64) \
libbcc_bpf.so.0()(64bit)"

RDEPENDS:${PN} += "(kernel-debug-devel if kernel-debug) \
(kernel-default-devel if (kernel-default or kernel-default-base)) \
(kernel-kvmsmall-devel if kernel-kvmsmall) \
(kernel-pae-devel if kernel-pae) \
(kernel-vanilla-devel if kernel-vanilla) \
/sbin/ldconfig \
kernel \
kernel-devel \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libbpf.so.1()(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.15()(64bit) \
libelf.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

SUMMARY = "Shared library from the BPF Compiler Collection"
DESCRIPTION = "Shared Library from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "libbcc0-0.26.0-2.12.aarch64.rpm"
RPM_HASH = "640c74fecd1c40fb50d438bddb98424abfe6d2696457dd36a6e630d2f89df3cb613a1c531290a1b1a398c9cfdf9d571aea5f4476d5bc4494e711ba17ab263645"

RPROVIDES:${PN} += "libbcc-bpf.so.0 \
libbcc.so.0 \
libbcc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
kernel \
kernel-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libbpf.so.1 \
libc.so.6 \
libclang-cpp.so.15 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

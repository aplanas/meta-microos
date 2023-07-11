SUMMARY = "Shared library from the BPF Compiler Collection"
DESCRIPTION = "Shared Library from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "libbcc0-0.26.0-2.11.aarch64.rpm"
RPM_HASH = "61458cd8492c8bb14007419144c973097ad07df397c224538032014ac1a5338bdae3f33d43acdd65172c9584d5ddc82b3de22f69ad04478ea974f397e3d20311"

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

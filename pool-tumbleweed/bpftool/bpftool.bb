SUMMARY = "Tool for inspection and manipulation of BPF programs and maps"
DESCRIPTION = "bpftool allows for inspection and simple modification of BPF objects (programs \
and maps) on the system."
LICENSE = "GPL-2.0-only"

PV = "7.2.0"

RPM_NAME = "bpftool-7.2.0-1.2.aarch64.rpm"
RPM_HASH = "ca2a9c5bf6cbe0bf3ab25704afc026e76dd24bced06eeb4f834a6d5dbf8160017540f69707a9e0a850e58b14239947a91f1905d5e69840e14ebf2c30a25a90a9"

RPROVIDES:${PN} += "bpftool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libcap.so.2 \
libelf.so.1 \
libz.so.1"

inherit rpm

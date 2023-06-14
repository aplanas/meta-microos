SUMMARY = "Tool for inspection and manipulation of BPF programs and maps"
DESCRIPTION = "bpftool allows for inspection and simple modification of BPF objects (programs \
and maps) on the system."
LICENSE = "GPL-2.0-only"

PV = "7.2.0"

RPM_NAME = "bpftool-7.2.0-1.1.aarch64.rpm"
RPM_HASH = "b2500692879f4fedef1e19c609884173eee0310fca12562b280351f8f07c73048196fde33ead103bb94eda297bf6961bc0723e4ed30a764198cc2f2a19405051"

RPROVIDES:${PN} += "bpftool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libcap.so.2 \
libelf.so.1 \
libz.so.1"

inherit rpm

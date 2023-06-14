SUMMARY = "High-level tracing language for Linux eBPF"
DESCRIPTION = "High-level tracing language for Linux, allowing for instrumentation of \
in-kernel and userspace state. It makes use of only upstream features such as \
eBPF tracing (which builds on kprobes, uprobes, and a variety of other kernel \
technologies). BPFtrace's language is inspired by awk and C, as well as other \
tracers such as DTrace and SystemTap."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "bpftrace-0.17.0-2.3.aarch64.rpm"
RPM_HASH = "0261255e4ea9fe6e1c2b3048e33de86485b0b3a4cedd0d5b2b296d48327e68a34fe570cff8333b656ea56cfbd5ff70d6b56b412b67c411d07edea4a6370c9233"

RPROVIDES:${PN} += "bpftrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libbcc-bpf.so.0 \
libbpf.so.1 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

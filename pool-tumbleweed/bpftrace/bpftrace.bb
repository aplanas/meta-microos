SUMMARY = "High-level tracing language for Linux eBPF"
DESCRIPTION = "High-level tracing language for Linux, allowing for instrumentation of \
in-kernel and userspace state. It makes use of only upstream features such as \
eBPF tracing (which builds on kprobes, uprobes, and a variety of other kernel \
technologies). BPFtrace's language is inspired by awk and C, as well as other \
tracers such as DTrace and SystemTap."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "bpftrace-0.17.0-2.4.aarch64.rpm"
RPM_HASH = "b6694b134930eaadcf6b238a4d4c624cc501168f02d1f5049f1e4157d8e4c997af1810a06f6382bc67a764df0265abe379e6e12a498d79be48265a3b2bf2a092"

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

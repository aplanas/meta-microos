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

RPROVIDES:${PN} += "bpftrace \
bpftrace(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libbcc_bpf.so.0()(64bit) \
libbpf.so.1()(64bit) \
libbpf.so.1(LIBBPF_0.0.1)(64bit) \
libbpf.so.1(LIBBPF_0.0.4)(64bit) \
libbpf.so.1(LIBBPF_0.0.5)(64bit) \
libbpf.so.1(LIBBPF_0.0.6)(64bit) \
libbpf.so.1(LIBBPF_0.0.7)(64bit) \
libbpf.so.1(LIBBPF_0.0.8)(64bit) \
libbpf.so.1(LIBBPF_0.0.9)(64bit) \
libbpf.so.1(LIBBPF_0.1.0)(64bit) \
libbpf.so.1(LIBBPF_0.2.0)(64bit) \
libbpf.so.1(LIBBPF_0.5.0)(64bit) \
libbpf.so.1(LIBBPF_0.6.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm

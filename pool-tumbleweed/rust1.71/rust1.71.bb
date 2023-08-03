SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. It maintains these goals without having a \
garbage collector, making it a useful language for a number of use \
cases other languages are not good at: embedding in other languages, \
programs with specific space and time requirements, and writing \
low-level code, like device drivers and operating systems. It improves \
on current languages targeting this space by having a number of \
compile-time safety checks that produce no runtime overhead, while \
eliminating all data races. Rust also aims to achieve 'zero-cost \
abstractions', even though some of these abstractions feel like those \
of a high-level language. Even then, Rust still allows precise control \
like a low-level language would."
LICENSE = "Apache-2.0 | MIT"

PV = "1.71.0"

RPM_NAME = "rust1.71-1.71.0-1.1.aarch64.rpm"
RPM_HASH = "1f9e0ad3e1dba7df1e4239283d8e5d7c49b21a32a3d379a90d106caf7f6433a07294d928e7f7e331c87e6b0e632fb3d0ac85b0a546ec42fff2a2ada5f570ddbe"

RPROVIDES:${PN} += "librustc-driver-ec9b1c8444f5eacc.so \
libstd-d71dfc79d8f9b30a.so \
libtest-cf453d899f1e8488.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.71"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gcc13 \
glibc-devel \
libLLVM.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
lld16"

inherit rpm

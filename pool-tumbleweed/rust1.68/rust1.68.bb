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

PV = "1.68.2"

RPM_NAME = "rust1.68-1.68.2-2.3.aarch64.rpm"
RPM_HASH = "7cd14f42e264606d68ea9c5f3e6aa5927e43fc5b5bdbb9527cf8ad885a8403c8001b842b54d2222e4f2e55f14fa78212ab35726e1045a429c679a5eb8097e0da"

RPROVIDES:${PN} += "librustc-driver-5336a680efdcd701.so \
libstd-37e479a680378554.so \
libtest-0ca154d522ccfacd.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.68"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gcc13 \
glibc-devel \
libLLVM.so.15 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
lld15"

inherit rpm

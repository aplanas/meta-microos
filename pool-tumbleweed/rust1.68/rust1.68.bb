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

RPM_NAME = "rust1.68-1.68.2-2.1.aarch64.rpm"
RPM_HASH = "1a15d527f9e0285660921c75922d85e5a4cb9d111a289aee5a546191003232976263bccd6dec5f9cc522a7b09afabcc647357a75cc440e37f5d3373c6d9066ad"

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

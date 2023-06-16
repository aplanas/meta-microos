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

PV = "1.69.0"

RPM_NAME = "rust1.69-1.69.0-2.1.aarch64.rpm"
RPM_HASH = "63af90466e6f735d45f4abb8c5c8b257ef6548b82dba2c007f37f9a4433a2334a526c7d86883b572613d20ece622761e6e651d8cdd2d7bc1baa65a394f9633c2"

RPROVIDES:${PN} += "librustc-driver-37f0a271ef4c31a8.so \
libstd-089a1bf1da2d598a.so \
libtest-692c536ac073a763.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.69"

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

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

PV = "1.71.1"

RPM_NAME = "rust1.71-1.71.1-1.1.aarch64.rpm"
RPM_HASH = "92a91be721bab05329c1cea58c1389cfb9350c8618a6e7ead895071ed50b121252cd488cbb5f10ec2b590aa32bae11ff83f19b70c782985047f40144b8435eb1"

RPROVIDES:${PN} += "librustc-driver-d5837fefbc3cd179.so \
libstd-477280fa289573d9.so \
libtest-05033fee61e03852.so \
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

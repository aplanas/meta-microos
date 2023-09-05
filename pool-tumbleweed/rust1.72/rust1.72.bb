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

PV = "1.72.0"

RPM_NAME = "rust1.72-1.72.0-1.1.aarch64.rpm"
RPM_HASH = "6503e403e78af91cbb377123ef27d5f756117371a093dc2d85fa599f2a21ce04fc2fbec9119ef959cdb5cd000c0cc467fb814003907f138450e9f129013b6594"

RPROVIDES:${PN} += "librustc-driver-86ec8e19e247fcd8.so \
libstd-7012d37416791e5b.so \
libtest-7f5d8f39f61219c3.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.72"

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

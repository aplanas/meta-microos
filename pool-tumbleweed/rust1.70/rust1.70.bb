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

PV = "1.70.0"

RPM_NAME = "rust1.70-1.70.0-1.2.aarch64.rpm"
RPM_HASH = "4273dd81e1c23b86233eb14bb34823bd6abeb3e6517119f6492294ea6bcab17c0722991f684c66862ec996278c2b1f5b1f64ac803698b1a82fe57fc664c196de"

RPROVIDES:${PN} += "librustc-driver-968fdfd40636dbe0.so \
libstd-591364c1a6b93412.so \
libtest-549cf7583356ece7.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.70"

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

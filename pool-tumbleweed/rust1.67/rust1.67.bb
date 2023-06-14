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

PV = "1.67.1"

RPM_NAME = "rust1.67-1.67.1-2.1.aarch64.rpm"
RPM_HASH = "0478559180cceca1a6fcf89d7a4819040eb5fba53a64fbe623e14333bfd9b5f423841e42e1b89740fbf99ac9509946b9ed59683b19e131faa30adfc306a26734"

RPROVIDES:${PN} += "librustc-driver-3715f284eb20f049.so \
libstd-e8f18da332925d29.so \
libtest-ec57ec8b09da6e8f.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.67"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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

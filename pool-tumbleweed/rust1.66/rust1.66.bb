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

PV = "1.66.0"

RPM_NAME = "rust1.66-1.66.0-2.4.aarch64.rpm"
RPM_HASH = "aba9063be4c5177323d84ec1f9f7c7210ae55ef6a0e82694f55ba7f90f94aa9c623dfd8dc4fdc9cf77ec0bef54e0035fc78bd6ade11636a1ebb9c8d76c92bb7a"

RPROVIDES:${PN} += "librustc_driver-1d3bf930f799b88c.so()(64bit) \
libstd-df1b5d798617bd93.so()(64bit) \
libtest-37852cb4186ec911.so()(64bit) \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.66 \
rust1.66(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
gcc13 \
glibc-devel \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
lld15"

inherit rpm
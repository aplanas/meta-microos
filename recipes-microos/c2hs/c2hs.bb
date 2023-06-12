SUMMARY = "C->Haskell FFI tool that gives some cross-language type safety"
DESCRIPTION = "C->Haskell assists in the development of Haskell bindings to C libraries. \
It extracts interface information from C header files and generates Haskell \
code with foreign imports and marshaling. Unlike writing foreign imports by \
hand (or using hsc2hs), this ensures that C functions are imported with the \
correct Haskell types."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.8"

RPM_NAME = "c2hs-0.28.8-4.2.aarch64.rpm"
RPM_HASH = "70b6e33f4c9163a3868d6316167ad3e311082255b6546bf2a8f25ae117fee1e5c6a82312e7dec662d771aec0dd464c26899438544538a902475c4f48901e450a"

RPROVIDES:${PN} += "c2hs \
c2hs(aarch-64)"
RDEPENDS:${PN} += "libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm

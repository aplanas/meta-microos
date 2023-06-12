SUMMARY = "Haskell base profiling library"
DESCRIPTION = "This package provides the Haskell base profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-prof-4.17.1.0-3.1.aarch64.rpm"
RPM_HASH = "d3420aff20a0f529ca5c2d5c4364150bd74d8d29a9295797ec4fb350cc3b66fc0e38ba961aa77a204fb7a66d949b5f6434e201ec96fffe41bd44ed51cc9baeb1"

RPROVIDES:${PN} += "ghc-base-prof \
ghc-base-prof(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-bignum-1.3) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(integer-gmp-1.1) \
ghc-prof(rts-1.0.2)"
RDEPENDS:${PN} += "ghc-base-devel(aarch-64) \
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
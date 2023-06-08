SUMMARY = "Haskell base library"
DESCRIPTION = "This package provides the Haskell base library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-4.17.1.0-1.1.aarch64.rpm"
RPM_HASH = "c72fcefaff7fa323059abd43171bbb8dcd66a8b7edac7f0cd963bdb59b4682e71da57b46534d05a6c6613f522be914bcf6dfb84e246874891e82c76a6b3024c9"

RPROVIDES:${PN} += "ghc-base ghc-base(aarch-64) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSinteger-gmp-1.1-ghc9.4.5.so()(64bit) libHSrts-1.0.2-ghc9.4.5.so()(64bit) libHSrts-1.0.2_debug-ghc9.4.5.so()(64bit) libHSrts-1.0.2_thr-ghc9.4.5.so()(64bit) libHSrts-1.0.2_thr_debug-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm

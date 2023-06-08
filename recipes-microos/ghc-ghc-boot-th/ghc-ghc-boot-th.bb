SUMMARY = "Haskell ghc-boot-th library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "6eafd919eec799c5146a03ecdf03fd0b62ede6f8d9284999cd298aeb4530d7996c5f818ad2b991320d1b24235ed64a4f2986f4b25b64ee480d2717b161ac1c1f"

RPROVIDES:${PN} += "ghc-ghc-boot-th ghc-ghc-boot-th(aarch-64) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

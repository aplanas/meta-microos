SUMMARY = "Haskell containers library"
DESCRIPTION = "This package provides the Haskell containers library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-0.6.7-3.1.aarch64.rpm"
RPM_HASH = "83cf4f3efacfa383a9d01972e5c3f38c50730ead3bdc43a7768e6d1312a4e6867c1e01d20ee12bf7c5f14c10c26767a8fe5ebfa8353f65c583ddde346150ec33"

RPROVIDES:${PN} += "ghc-containers ghc-containers(aarch-64) libHScontainers-0.6.7-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

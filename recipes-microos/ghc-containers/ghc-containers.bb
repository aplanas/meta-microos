SUMMARY = "Haskell containers library"
DESCRIPTION = "This package provides the Haskell containers library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "a617284890b8457de719c5278d634bd554e810573cfb746444d4e803b317624fb108c4370ed7759e0037449af1611ea437ef024b621c6051a0f10e9fb8773a69"

RPROVIDES:${PN} += "ghc-containers ghc-containers(aarch-64) libHScontainers-0.6.7-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

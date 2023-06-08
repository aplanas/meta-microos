SUMMARY = "Haskell binary library"
DESCRIPTION = "This package provides the Haskell binary library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "39e67ec99b410b96a05e3e438f94f6c9fe66c7be04a9be21276437f1d9b3472c03b922e87b2b5f8d0bb73ef97b0abfa518e8f06c2d4953cb23e3f31db621f636"

RPROVIDES:${PN} += "ghc-binary ghc-binary(aarch-64) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

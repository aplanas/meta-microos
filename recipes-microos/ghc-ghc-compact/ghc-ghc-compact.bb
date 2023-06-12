SUMMARY = "Haskell ghc-compact library"
DESCRIPTION = "This package provides the Haskell ghc-compact library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "8ae1f91e913f60b1b462dd311f581d87fabde67f4a4b7c511475b3eed22ee39647a4d119ffd5fefb7395d8c0e25772fad337f934c712e15e1137618935fd3101"

RPROVIDES:${PN} += "ghc-ghc-compact \
ghc-ghc-compact(aarch-64) \
libHSghc-compact-0.1.0.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

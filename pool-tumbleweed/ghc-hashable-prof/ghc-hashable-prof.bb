SUMMARY = "Haskell hashable profiling library"
DESCRIPTION = "This package provides the Haskell hashable profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.3.0"

RPM_NAME = "ghc-hashable-prof-1.4.3.0-1.3.aarch64.rpm"
RPM_HASH = "0a36089ca680687e369885b122b6d5c99b2cc3322de10b74e1683d412d190629d5b4dbb0596e867e01255ebf80c553b3c44136f340a8e8cf6706a9ec5f64a075"

RPROVIDES:${PN} += "ghc-hashable-prof \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP"

RDEPENDS:${PN} += "ghc-hashable-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-text-2.0.2"

inherit rpm

SUMMARY = "Haskell HTTP profiling library"
DESCRIPTION = "This package provides the Haskell HTTP profiling library."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-prof-4000.4.1-1.7.aarch64.rpm"
RPM_HASH = "d42f6ac25dcd9044ab25fb02eb7d633feee0724c58db07010204c2ad5d43e29730b4dab7f1b8dfff6ddfb010a40ebd0d62d06c415420236f1ea76c5aa08cb8c3"

RPROVIDES:${PN} += "ghc-HTTP-prof \
ghc-prof-HTTP-4000.4.1-7No2v5wGQP7LivFOppGzbz"

RDEPENDS:${PN} += "ghc-HTTP-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

SUMMARY = "Haskell HTTP library development files"
DESCRIPTION = "This package provides the Haskell HTTP library development files."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-devel-4000.4.1-1.7.aarch64.rpm"
RPM_HASH = "8536484ba0e0b58180988eaff3bda6e373faf1f56892d8e40e8d4690aa2d5c70d57022af72a16ca5825f84e7a9779369099a4ad4141972fdf69e7d1aa613b73a"

RPROVIDES:${PN} += "ghc-HTTP-devel \
ghc-devel-HTTP-4000.4.1-7No2v5wGQP7LivFOppGzbz"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HTTP \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm

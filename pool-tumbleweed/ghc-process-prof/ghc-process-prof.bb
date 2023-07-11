SUMMARY = "Haskell process profiling library"
DESCRIPTION = "This package provides the Haskell process profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-prof-1.6.16.0-3.2.aarch64.rpm"
RPM_HASH = "70938349e77e9a75d9c225a2e19abb670b66abdd8bde1ed73f570c6807be8f51cc128d6c2cf118c66c7bb9659d281bda083d3ad60b9c03b0ef1c2b8261d1952b"

RPROVIDES:${PN} += "ghc-process-prof \
ghc-prof-process-1.6.16.0"

RDEPENDS:${PN} += "ghc-process-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-unix-2.7.3"

inherit rpm

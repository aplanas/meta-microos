SUMMARY = "Haskell transformers profiling library"
DESCRIPTION = "This package provides the Haskell transformers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-prof-0.5.6.2-3.2.aarch64.rpm"
RPM_HASH = "cf1c04d82be8a61b5c293d01c9f3725891f8f8816bcd51778fcd1f68dcfd316435d86748c333003d1390d70424f86067f91fcb4cac74aa13da7ac67d610ed09b"

RPROVIDES:${PN} += "ghc-prof-transformers-0.5.6.2 \
ghc-transformers-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-transformers-devel"

inherit rpm

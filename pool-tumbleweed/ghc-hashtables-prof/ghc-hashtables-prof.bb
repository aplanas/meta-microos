SUMMARY = "Haskell hashtables profiling library"
DESCRIPTION = "This package provides the Haskell hashtables profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-prof-1.3.1-1.9.aarch64.rpm"
RPM_HASH = "dcb1ab675e5a844c84bc1234c0b8673c201f9bc23f89c633a9ea05c6f676c35efa90a94b0e35d7680f556026d8838d1963dc0c83b1dc8365fc98d6681205a3dd"

RPROVIDES:${PN} += "ghc-hashtables-prof \
ghc-prof-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T"

RDEPENDS:${PN} += "ghc-hashtables-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm

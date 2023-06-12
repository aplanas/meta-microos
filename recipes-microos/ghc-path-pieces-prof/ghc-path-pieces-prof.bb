SUMMARY = "Haskell path-pieces profiling library"
DESCRIPTION = "This package provides the Haskell path-pieces profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-prof-0.2.1-12.2.aarch64.rpm"
RPM_HASH = "ffe0d0de60a3f6b4b6b99ee072af2cf224f333bab8f797b7fa7be60296cbcacd39fa5771a9b9dddb96012ac8b1d4cce54de6e837369ca6353bb245e6e507fb0f"

RPROVIDES:${PN} += "ghc-path-pieces-prof \
ghc-path-pieces-prof(aarch-64) \
ghc-prof(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4)"
RDEPENDS:${PN} += "ghc-path-pieces-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2)"

inherit rpm

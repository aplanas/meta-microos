SUMMARY = "Haskell timeit profiling library"
DESCRIPTION = "This package provides the Haskell timeit profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-prof-2.0-6.3.aarch64.rpm"
RPM_HASH = "d2b0ed9782f3561ef586f12abe90ce5721c245d322a433b33c57f7fd58f3a3ccdc0ede67a4bc1f8519bb680fa427184537b6b0fa6ab5ee7e4d730b6cb996ac7f"

RPROVIDES:${PN} += "ghc-prof-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-timeit-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-timeit-devel"

inherit rpm

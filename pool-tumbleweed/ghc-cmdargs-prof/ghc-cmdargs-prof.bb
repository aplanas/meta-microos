SUMMARY = "Haskell cmdargs profiling library"
DESCRIPTION = "This package provides the Haskell cmdargs profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-prof-0.10.22-1.3.aarch64.rpm"
RPM_HASH = "9b63b4113252175c73141ab03e35c98a5eb09d694025b8e4561aef7dcb4ccc893bd0e9b6a8e04895cb07d1a2c86b6a005f7b859ed6797b9efe1fbc307809e16b"

RPROVIDES:${PN} += "ghc-cmdargs-prof \
ghc-prof-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx"

RDEPENDS:${PN} += "ghc-cmdargs-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

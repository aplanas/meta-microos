SUMMARY = "Haskell cmdargs profiling library"
DESCRIPTION = "This package provides the Haskell cmdargs profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-prof-0.10.22-1.6.aarch64.rpm"
RPM_HASH = "4aab96cb0189bdb7b5d95d72d49cb0a6474583b9cbe77050f9f8eaa6e222fa58e4f41c17dfc2aec46ff91b092cdeed94c41847e535a248a5f739d7fbaae54662"

RPROVIDES:${PN} += "ghc-cmdargs-prof \
ghc-prof-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx"

RDEPENDS:${PN} += "ghc-cmdargs-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

SUMMARY = "Haskell exceptions profiling library"
DESCRIPTION = "This package provides the Haskell exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-prof-0.10.5-3.2.aarch64.rpm"
RPM_HASH = "2684bbc8d67ae13763e19a349454b305deb49b894149dbe7cdaa2648f3c9c3e8f77513a2f42202ce76b9f6c82be93ea4c8fde2515930a50a63f534c3b9888459"

RPROVIDES:${PN} += "ghc-exceptions-prof \
ghc-prof-exceptions-0.10.5"

RDEPENDS:${PN} += "ghc-exceptions-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

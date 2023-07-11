SUMMARY = "Haskell splitmix profiling library"
DESCRIPTION = "This package provides the Haskell splitmix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-prof-0.1.0.4-4.6.aarch64.rpm"
RPM_HASH = "9519d0596e581e87267298dcaae54bbf950c385c754205c7885be025c2279f18517f79f5550644ce15f54fef900cedffbb9edf85d0d8558c6483648de52cc7b8"

RPROVIDES:${PN} += "ghc-prof-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-splitmix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-splitmix-devel"

inherit rpm

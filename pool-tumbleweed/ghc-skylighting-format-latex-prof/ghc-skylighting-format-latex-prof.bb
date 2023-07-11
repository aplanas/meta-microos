SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.4.aarch64.rpm"
RPM_HASH = "469719c08fd0e0b3807d10fec6bd055f14a5f83fdfe7c50d9f151e7d7a2f176f315306d3f44dcbd7b16154f766026949a3cba2ef94360da92d660d023f743c5b"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-8E2kKavCeIp7J2nfRBTdHs \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-latex-devel"

inherit rpm

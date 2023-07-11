SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.4.aarch64.rpm"
RPM_HASH = "18571ce949a3e35f981ab52d594535f1b93a497cf92d65f0045b12620c16a861436655a50c67049168409794bdc037b731bded43c23ac454a6baafe7450de028"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-9kgX49cteJhG5oRziiwfwa \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-context-devel"

inherit rpm

SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1-2.6.aarch64.rpm"
RPM_HASH = "f5a541a5352ae270885394c8f23ddbe18097bce52573a2f77f97b07dafc64b114d48033d42c28af379a685b92ee0a18aaff8f0b474d9e5eb37ee5b7fde247e89"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1-96IxqoyNHvLGcjrkFPKZr9 \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm

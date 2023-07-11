SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1-2.4.aarch64.rpm"
RPM_HASH = "a8384ad029e6400fb73a05fc6796f2535cd13c6374d594057b47de0821d6e580e9557721b94c08854f84fcd826c899543cafb1f212a81f0610fd2ef23e03cfc0"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1-F12UWgv4wxWHCG1WBLqTVs \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm

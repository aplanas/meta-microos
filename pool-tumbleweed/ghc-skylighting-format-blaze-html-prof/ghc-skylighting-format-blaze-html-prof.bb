SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.1-2.3.aarch64.rpm"
RPM_HASH = "7c89cdead95bf0e8719478329e9df0e7056ce4f217e6e88d10ba0ebaa8d8a3ca0b108a0c84158f8a95f1d3d0f2b3027a6d81fdacfd8bb8bfe3aa28011c126459"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.1-GSLRiRB6bjcEjUjplnknYR \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-prof-text-2.0.2 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm

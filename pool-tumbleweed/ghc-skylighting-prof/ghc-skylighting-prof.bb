SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-prof-0.13.4.1-1.1.aarch64.rpm"
RPM_HASH = "4e60e05e932495e14979ef4c0074b45cb47ca8aa4de90ab21d154971ab29d90b838733ae1723c3a0780a04c5dfb19679eb2b8e5ef067551812e4e74f592f8e2e"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.4.1-CU1AlEko5yK2gCD1OmtnCm \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-prof-skylighting-format-ansi-0.1-6378BOa13TnAAEhx7jAIGl \
ghc-prof-skylighting-format-blaze-html-0.1.1-96IxqoyNHvLGcjrkFPKZr9 \
ghc-prof-skylighting-format-context-0.1.0.2-I1BZIYXYOqlBramxRueIsx \
ghc-prof-skylighting-format-latex-0.1-J2O8wjQxddL48jSKv998Ye \
ghc-skylighting-devel"

inherit rpm

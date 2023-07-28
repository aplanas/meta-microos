SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.5.aarch64.rpm"
RPM_HASH = "c044bfb14d3d7e1e11de5bec5c34f072f58efbd0fefecd508ad2af1c5b687e12f0774fade8961751153f766c9b399ad839b9b82ae95fa522f163414a360441de"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-KUWKzkdJqvB1foV6pwv6yZ \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm

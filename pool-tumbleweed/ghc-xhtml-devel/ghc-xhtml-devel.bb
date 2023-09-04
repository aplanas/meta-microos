SUMMARY = "Haskell xhtml library development files"
DESCRIPTION = "This package provides the Haskell xhtml library development files."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-devel-3000.2.2.1-1.1.aarch64.rpm"
RPM_HASH = "93ed93a8ac69bc8b035bd3c69825364e286df829f412cebc78b193e7f6f04eece205e88ae9b358bce51c06b79f261ab1a9330d5149fefe7d7e841c9c29a3db65"

RPROVIDES:${PN} += "ghc-devel-xhtml-3000.2.2.1 \
ghc-xhtml-devel \
ghc-xhtml-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-xhtml"

inherit rpm

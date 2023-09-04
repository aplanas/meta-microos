SUMMARY = "Haskell html library development files"
DESCRIPTION = "This package provides the Haskell html library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-devel-1.0.1.2-4.3.aarch64.rpm"
RPM_HASH = "1b87ae8c8a63803078e2d3271515d83d40e1b9f804ad5fc00a9d32c560927fdd617e9ffc6b0adec1761f333019da11035dab1308c834a70b1e44135a156e2414"

RPROVIDES:${PN} += "ghc-devel-html-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu \
ghc-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-html"

inherit rpm

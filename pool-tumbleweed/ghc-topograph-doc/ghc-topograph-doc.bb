SUMMARY = "Haskell topograph library documentation"
DESCRIPTION = "This package provides the Haskell topograph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-doc-1.0.0.2-2.2.noarch.rpm"
RPM_HASH = "a7a2ea0e79681043d5e267b1ea577803f0de221ca15e0ef5f8718ba9f7ef1520458c2c5a8713557b34cde1619426e110f27b2ff40bf37ef80f122bfd9e87a43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-topograph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

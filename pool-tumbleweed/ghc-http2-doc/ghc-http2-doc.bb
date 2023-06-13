SUMMARY = "Haskell http2 library documentation"
DESCRIPTION = "This package provides the Haskell http2 library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-doc-3.0.3-2.3.noarch.rpm"
RPM_HASH = "a1faaf6ebd4452e7b517e7a2822a50967906bb8e7f7320b97969e87816cdb75f2c3cec91c408608f518d33a64499016d2af87dc93d3d64b7300023b858d60008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http2-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-doc-2.3.8.2-2.5.noarch.rpm"
RPM_HASH = "b6b99affb3efc815ee642ff31ed7ecdead1133d1f7895059f4dfe6858807e7a421dd8e3c04ba35c2f06d27b78688ebb0631adb93e27b4a5369846df499786c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

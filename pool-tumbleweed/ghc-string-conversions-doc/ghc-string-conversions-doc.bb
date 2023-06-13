SUMMARY = "Haskell string-conversions library documentation"
DESCRIPTION = "This package provides the Haskell string-conversions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-doc-0.4.0.1-3.2.noarch.rpm"
RPM_HASH = "38f5ccd7dbf52b3ff4a720219fab5c6d40fc08b5a6be14bfc7caea2903ead133abaf3adeedb248945d37ae455635bc2540f128fc4a30264782d2120f3fc88eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-string-conversions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

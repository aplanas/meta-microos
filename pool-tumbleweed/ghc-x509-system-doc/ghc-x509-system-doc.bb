SUMMARY = "Haskell x509-system library documentation"
DESCRIPTION = "This package provides the Haskell x509-system library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-doc-1.6.7-2.3.noarch.rpm"
RPM_HASH = "3f5f00181482e7958c2dd7768b5b46866a9c98ba298996c201876c7b50f554a8c76d668111ff927d7c236eb3e7af6cbd91ee646a6acc6d3aafc4b2d0acc59a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-system-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

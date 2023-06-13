SUMMARY = "Haskell zlib library documentation"
DESCRIPTION = "This package provides the Haskell zlib library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-doc-0.6.3.0-2.3.noarch.rpm"
RPM_HASH = "4f3cdae7e8e90113e87655f1d32c9c61033b33fdc9bbb8c77ad18b4290ea5d76d351319b411ce631ade2ab3b78f1424d908443c1fe63db3d02d87f5c087e6dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell ghc-boot-th library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-th-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "4909c918e8987390108590b70bff1a1c5a8257fa83e2c1d89b355622a34e5e324565920afb5cb0cef454a858e74653eef24de9c71ca5ec1953dc2cddc2ca479d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell gitrev library documentation"
DESCRIPTION = "This package provides the Haskell gitrev library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-doc-1.3.1-9.3.noarch.rpm"
RPM_HASH = "e00f9217047175de701f94fb96fcbd81d0ef8c628e5b84afa994c849b45638fbe3a9caebe037e3e9c8cee3e3bd55e795fc1a1207d7467ac6a2297a051babba31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gitrev-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

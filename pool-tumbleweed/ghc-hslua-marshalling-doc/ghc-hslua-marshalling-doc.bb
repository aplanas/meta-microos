SUMMARY = "Haskell hslua-marshalling library documentation"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-doc-2.3.0-1.8.noarch.rpm"
RPM_HASH = "4a461530d2f94286894e6b3a8b66823fa6114e796fb27119321541ec92d59e578333cd4175d91ba85dda8e0881c256b489c04437e938467a1fa3c5c4426a0ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-marshalling-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

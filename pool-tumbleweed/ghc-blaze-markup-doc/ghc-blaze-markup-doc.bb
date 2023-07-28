SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-doc-0.8.2.8-6.1.noarch.rpm"
RPM_HASH = "13a4ae16ced27a00526e2a462ff9ed4139a6803ef9aca9c2831bdabb92f4982dd722264c38d1a8734a3b3da7657ccacbfa32def490812a05e3ae5488645d6409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

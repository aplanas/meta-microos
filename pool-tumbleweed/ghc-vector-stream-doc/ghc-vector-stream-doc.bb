SUMMARY = "Haskell vector-stream library documentation"
DESCRIPTION = "This package provides the Haskell vector-stream library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-doc-0.1.0.0-3.1.noarch.rpm"
RPM_HASH = "753bebf55e5afc8176589d6ac81394a29c1e02caaac441e4c1d8fd56373a7f2e11b8ca5005367651ed800f4213f034ffada8b7ba8e0042da2134cb532c9fdf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-stream-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

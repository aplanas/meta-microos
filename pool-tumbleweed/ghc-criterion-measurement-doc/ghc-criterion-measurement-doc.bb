SUMMARY = "Haskell criterion-measurement library documentation"
DESCRIPTION = "This package provides the Haskell criterion-measurement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-doc-0.2.1.0-1.2.noarch.rpm"
RPM_HASH = "c9d0a3f9b3e6fa688b1bd9490e46dcd4d4278ccb8bc9de8e8f5db49eda42bf671907f8c1399564e723a1f280f4fdb17a1315437ee66fcef1be6a3754ec6dd567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-measurement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

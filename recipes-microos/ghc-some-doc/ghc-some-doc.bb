SUMMARY = "Haskell some library documentation"
DESCRIPTION = "This package provides the Haskell some library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-doc-1.0.5-1.3.noarch.rpm"
RPM_HASH = "e4f0752fa7daf94a02c1e83ad23181f91be8fc86e2a82248e091daba216186e06ede45db1b4da81859af3561c05d85cb871112d0dc22d779832dd79182ee2762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-some-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

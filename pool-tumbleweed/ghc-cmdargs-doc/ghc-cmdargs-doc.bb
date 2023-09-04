SUMMARY = "Haskell cmdargs library documentation"
DESCRIPTION = "This package provides the Haskell cmdargs library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-doc-0.10.22-1.8.noarch.rpm"
RPM_HASH = "742c61533f0c9db3515e8f1ccc7b9f37fd52a2c5196deaddc56bdbf706e92c43e8a305731fbb254230269dfd300c360ec52ecfbe91357ea9528cae8db5cd9504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cmdargs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

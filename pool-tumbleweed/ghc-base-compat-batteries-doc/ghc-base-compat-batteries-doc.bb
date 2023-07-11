SUMMARY = "Haskell base-compat-batteries library documentation"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library documentation."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-doc-0.13.0-1.3.noarch.rpm"
RPM_HASH = "70320a10517232f715ba96b2d8e0899b8b3aead4b300ff567b709a56804e366094009e154e441756c301b5bc3b6f4237a19f043a9030ca5b4d4a5f491c43a34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-batteries-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

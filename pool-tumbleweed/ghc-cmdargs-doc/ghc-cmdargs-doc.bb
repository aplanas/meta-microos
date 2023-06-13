SUMMARY = "Haskell cmdargs library documentation"
DESCRIPTION = "This package provides the Haskell cmdargs library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-doc-0.10.22-1.3.noarch.rpm"
RPM_HASH = "099718fd7ff03724bf8b4c7ea3e0198947d02ad1780043730011c40c9b6503785598c2e12a33a817f1ceecd4a346a8cdeeb22388187df2de96200ed7189626a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cmdargs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell th-compat library documentation"
DESCRIPTION = "This package provides the Haskell th-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-doc-0.1.4-3.1.noarch.rpm"
RPM_HASH = "a1f40d77fb6d91a915521320c7c961e7245e8a485887f23a07375955bcbe518fa746d76f1adb5044554d2ac9a992df0013a521c282f0cf5332e8a41daf232a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

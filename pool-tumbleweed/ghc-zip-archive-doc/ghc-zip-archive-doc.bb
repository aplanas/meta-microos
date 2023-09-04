SUMMARY = "Haskell zip-archive library documentation"
DESCRIPTION = "This package provides the Haskell zip-archive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-zip-archive-doc-0.4.3-1.3.noarch.rpm"
RPM_HASH = "2b33e2647e04ca051f6c1712836ad4d60544a8e8a27d17343ed4ffe6fe6b6ca760b151774f03cb1c59e24f3c0e1c483ba20c06fd15036ebeaaab9bd3cf35c391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zip-archive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell SafeSemaphore library documentation"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-doc-0.10.1-5.6.noarch.rpm"
RPM_HASH = "2936b1375da563973cb39a6c7ddef98a878490a48271f9eeeb7a856e2c504344f36b55aa66a743976c4f7e24ef0a71d046346e239fcf257f4a23cba3fee8a41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SafeSemaphore-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

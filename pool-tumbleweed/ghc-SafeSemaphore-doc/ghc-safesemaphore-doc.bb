SUMMARY = "Haskell SafeSemaphore library documentation"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-doc-0.10.1-5.8.noarch.rpm"
RPM_HASH = "0d79317f491faad6007a389fea8522b2a8eb4d0047940b845761fc7cb45d461feaa9fa6a6fbae8d145b432953621a1a4e2d544f4c2356add565eb112bf567d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SafeSemaphore-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

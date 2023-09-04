SUMMARY = "Haskell microstache library documentation"
DESCRIPTION = "This package provides the Haskell microstache library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-doc-1.0.2.3-3.5.noarch.rpm"
RPM_HASH = "603990e8464ee43a245f4d2dbcc5dc9e2c681faca2ddd4b97d2389935a14fd4c6044a8a0e6505eed6bf620884e9d173fa05d9c5dfe530bd8ab1fbb43a0198889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microstache-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

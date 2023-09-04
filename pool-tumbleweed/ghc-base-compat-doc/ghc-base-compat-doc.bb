SUMMARY = "Haskell base-compat library documentation"
DESCRIPTION = "This package provides the Haskell base-compat library documentation."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-doc-0.13.0-1.5.noarch.rpm"
RPM_HASH = "a1e7210ef386049a1c4e698663f2e5ff26c270bffc01906edf19d7a508a61d75c59b44712a593da25bb4a44047b7a1ddf5da161ef43c15a75130a5e0a4b5e03d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

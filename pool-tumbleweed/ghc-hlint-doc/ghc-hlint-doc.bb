SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-doc-3.5-1.17.noarch.rpm"
RPM_HASH = "932e164c0d1364c307e90a743e7781804d57c7cb8615d23b5430fd0c0e8bb9f5fff37ffbc94144bffa29b5bdf58097ff1bc9e7e06a9cef8e7bc8dc28829e211b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

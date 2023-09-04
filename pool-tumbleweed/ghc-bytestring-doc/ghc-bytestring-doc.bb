SUMMARY = "Haskell bytestring library documentation"
DESCRIPTION = "This package provides the Haskell bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.5.1"

RPM_NAME = "ghc-bytestring-doc-0.11.5.1-1.1.noarch.rpm"
RPM_HASH = "595b0764ff1a6726c19537f6ddfb8f884dd79e1dccce44544a14f0c374a1fb750a5c59d3e5ee4d9e10e971e52e76f027c6ec0c2608e7989fbcb84a2c713ff07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

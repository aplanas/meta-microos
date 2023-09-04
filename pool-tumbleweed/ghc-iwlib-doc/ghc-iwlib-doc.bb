SUMMARY = "Haskell iwlib library documentation"
DESCRIPTION = "This package provides the Haskell iwlib library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-doc-0.1.2-2.3.noarch.rpm"
RPM_HASH = "1e6b11563d09047f0f9a8437da17f6983046760ffa5742faa1298c5e37f518c48cfc873503dd22f396949f0ccdfe9827f55b466eb0ebf5b80d4d417d7e628a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iwlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

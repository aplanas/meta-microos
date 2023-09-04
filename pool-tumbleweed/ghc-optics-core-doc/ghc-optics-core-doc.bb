SUMMARY = "Haskell optics-core library documentation"
DESCRIPTION = "This package provides the Haskell optics-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-doc-0.4.1.1-1.4.noarch.rpm"
RPM_HASH = "b1c36eca05a79b578152098f5b22ae5aba96ac72d248c268c6391aff99e2d96b0bafdf2de5d62510bc9431b5dc7c585ef70e6ac5fc9e15956cf6acb92bc0440a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optics-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

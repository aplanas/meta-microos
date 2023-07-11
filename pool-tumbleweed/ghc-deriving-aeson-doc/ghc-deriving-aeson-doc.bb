SUMMARY = "Haskell deriving-aeson library documentation"
DESCRIPTION = "This package provides the Haskell deriving-aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-doc-0.2.9-2.3.noarch.rpm"
RPM_HASH = "9f8d5f361f8cf0387b407d36e1638781c79431609a9dcee8bea0f0e7ba9a470c85a799d7a9a02a0e1fc829fdc26e9e7d3194584fb57368632fb2600e1dc45174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deriving-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell haskeline library documentation"
DESCRIPTION = "This package provides the Haskell haskeline library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-doc-0.8.2-3.2.noarch.rpm"
RPM_HASH = "12bef0d0f55f32d7615f786cd7d7b82053e58d37f9e12266d5d2a527a386ea1200b2965a52f940f357da99624d750f3ea9791450907022e75b4b632e7a807ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haskeline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

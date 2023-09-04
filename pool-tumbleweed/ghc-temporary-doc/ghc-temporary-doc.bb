SUMMARY = "Haskell temporary library documentation"
DESCRIPTION = "This package provides the Haskell temporary library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-doc-1.3-6.3.noarch.rpm"
RPM_HASH = "8f5327c16d9c5c1adced93298792dcc1ac3fbb0a01d0b1b7b7adbac691ee29939ce1c0b2052b7cbea8afece702eaea887bfa9cd299f329a0c8f6a0d1614ce6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-temporary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

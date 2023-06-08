SUMMARY = "Haskell aeson-pretty library documentation"
DESCRIPTION = "This package provides the Haskell aeson-pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-doc-0.8.9-4.2.noarch.rpm"
RPM_HASH = "9f709dd7f364b02c8ce3d5dfbf5e048886ba27028163a6a26ddc06766f678428cdf5b0a61bfc9f6a37e3dcedf2cce125a9731582d1b1536ee96dbb5ff1abd1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-pretty-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

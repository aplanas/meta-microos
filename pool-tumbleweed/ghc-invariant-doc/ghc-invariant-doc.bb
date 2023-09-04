SUMMARY = "Haskell invariant library documentation"
DESCRIPTION = "This package provides the Haskell invariant library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-invariant-doc-0.6.2-1.2.noarch.rpm"
RPM_HASH = "f78c1ce069be581daf7c7dd9f3ebe708fbfafaba15f337a67a52f18ee93a1c7f3de3fbdf0f68300682c01ceeb297a2adb82c6f49f2c7bcbf6bc84e21dd51da54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-invariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

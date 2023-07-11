SUMMARY = "Haskell microlens-platform library documentation"
DESCRIPTION = "This package provides the Haskell microlens-platform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-doc-0.4.3.3-2.4.noarch.rpm"
RPM_HASH = "6c3469e46ad53ada7577f9e9f83d4efdc00303bc42ac8759daee02ddfa86bd4ce4ef1057d8afb23483b516016a440a3959650ecc4cfbe14e9916377f87c1ef1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-platform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell Decimal library documentation"
DESCRIPTION = "This package provides the Haskell Decimal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-doc-0.5.2-2.3.noarch.rpm"
RPM_HASH = "34a03a6a951cf9cdb09ae24b821e0f1a8863f149bf10813aefc50894fd69b3256c48872c0e751e071c96e51e161b08fbb65e32bb6c76ce2bdf52dbb396124eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Decimal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

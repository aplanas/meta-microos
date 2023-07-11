SUMMARY = "Haskell profunctors library documentation"
DESCRIPTION = "This package provides the Haskell profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-doc-5.6.2-4.6.noarch.rpm"
RPM_HASH = "8a24014564836d13d2d630ed3527d2becfd3d04362c95dec1a94233431461ab27df71d05b111345854d7c373c3b6537ee7f4a161855ab0fd98fa582f1782e628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

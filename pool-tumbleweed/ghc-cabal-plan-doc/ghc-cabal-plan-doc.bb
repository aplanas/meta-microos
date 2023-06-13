SUMMARY = "Haskell cabal-plan library documentation"
DESCRIPTION = "This package provides the Haskell cabal-plan library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2.3"

RPM_NAME = "ghc-cabal-plan-doc-0.7.2.3-1.3.noarch.rpm"
RPM_HASH = "e443368eb8d5fe5db09a1d0d8361aa85dec03adc4c552b76382b48e5ea924327ce1a9b7cfde05a22f2c4d22da36fe7bd4e64e9a5782c42b5aa40807e1d38d552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-plan-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

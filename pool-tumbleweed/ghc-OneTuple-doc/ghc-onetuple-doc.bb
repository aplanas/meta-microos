SUMMARY = "Haskell OneTuple library documentation"
DESCRIPTION = "This package provides the Haskell OneTuple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-OneTuple-doc-0.3.1-4.2.noarch.rpm"
RPM_HASH = "6d5982dd0e8f5a4d2f1160d7d931a6b680c818930a6989ec09c54ad6dcfb5d303002b085e18d999718c24d413588268c307e9b7cef73737486fc04501f2afb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-OneTuple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

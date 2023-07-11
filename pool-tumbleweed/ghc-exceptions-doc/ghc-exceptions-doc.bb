SUMMARY = "Haskell exceptions library documentation"
DESCRIPTION = "This package provides the Haskell exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-doc-0.10.5-3.2.noarch.rpm"
RPM_HASH = "41878d860cea8c317b6464a4b2cbfecbe9857ec730f5920004c4dfe30d5fb6c97e62f304f309782345ef811bee4744ad966c69a61decddbf1ad9283493bc35e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

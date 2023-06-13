SUMMARY = "Haskell lift-type library documentation"
DESCRIPTION = "This package provides the Haskell lift-type library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-doc-0.1.1.1-2.2.noarch.rpm"
RPM_HASH = "e6130355e88b33657e213245cca767a52a5f1105675934b54424eb0b9880abb211449527b830170b97d304e811eb044d941662d96d4dcebdc4c40a9582ad3c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lift-type-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell doctemplates library documentation"
DESCRIPTION = "This package provides the Haskell doctemplates library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-doc-0.11-1.7.noarch.rpm"
RPM_HASH = "7838a21396005bc5e0c820a820713ce7197db0e0e0e4e293ad1a695f139f0a0911bf3c6d6d19218c8fcc8c09a0f1ebed110db11471aa20c1da1c6d66df998935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doctemplates-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

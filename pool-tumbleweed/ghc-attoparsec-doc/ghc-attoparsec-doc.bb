SUMMARY = "Haskell attoparsec library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-doc-0.14.4-4.1.noarch.rpm"
RPM_HASH = "1408d209d868d3a167c76b9f1966a66965aee4b497facc7e5d39af6018483def0cf4a5ce43c3a35cdb56dc02cc0a60bfc67fc336378d77da0c24d3abff385301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

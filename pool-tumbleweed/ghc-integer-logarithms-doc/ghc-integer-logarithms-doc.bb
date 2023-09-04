SUMMARY = "Haskell integer-logarithms library documentation"
DESCRIPTION = "This package provides the Haskell integer-logarithms library documentation."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-doc-1.0.3.1-6.6.noarch.rpm"
RPM_HASH = "de9d9e9f7a61f8170afba729e6328a7cbf0ab9d0027ad85553afb243b7ed04e001acacc52d18f6ac049d64d33b8f2e91efac4d628cfd0548885e0f4e7a6cb479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-integer-logarithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell integer-logarithms library documentation"
DESCRIPTION = "This package provides the Haskell integer-logarithms library documentation."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-doc-1.0.3.1-6.5.noarch.rpm"
RPM_HASH = "f07a974da1334a7d4bd538d0a539c7ea83e5faf208afb7f4706fec78f61cde3016361da76b19f1b1d6571e8bf432296e0c5c68f7d5c9119a3a072037caf5a44f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-integer-logarithms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

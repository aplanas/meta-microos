SUMMARY = "Haskell topograph library documentation"
DESCRIPTION = "This package provides the Haskell topograph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-doc-1.0.0.2-2.3.noarch.rpm"
RPM_HASH = "fb5014b845a8a1ad0394a74543edbca5df4858b4536c9d4b10da4728d2f8591e69a100f1eabb5bc1e434cf70bd138bba249333fb1b971fa33b51492ce909d4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-topograph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

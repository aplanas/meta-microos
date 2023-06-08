SUMMARY = "Haskell html library documentation"
DESCRIPTION = "This package provides the Haskell html library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-doc-1.0.1.2-4.2.noarch.rpm"
RPM_HASH = "d48539613caff62cdfdb0f19715ef6145c092492f905eb03c1b16dce58cea67fb909b089540a55ca6d33f96f4be7816e54993fb1133e5d51c017c1bc26c0c66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-html-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

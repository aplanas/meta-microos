SUMMARY = "Haskell JuicyPixels library documentation"
DESCRIPTION = "This package provides the Haskell JuicyPixels library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-doc-3.3.8-1.6.noarch.rpm"
RPM_HASH = "de0f7edb388b446d979dd467deb48a2b262c83daf3f3439c30a26f99066e2e481b5bf3b03a8f136c17bf08a4d1f37e455676e311284c90b4bd4439c9d8637a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-JuicyPixels-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell crypto-random library documentation"
DESCRIPTION = "This package provides the Haskell crypto-random library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-doc-0.0.9-6.3.noarch.rpm"
RPM_HASH = "bacb3d71cece7292b095b7dc272c04cbfcc73cdc538e70e96327079df7b8e868fd6a294cb1790eb0c98917898c5e727cae72f53b21da7cfd54be9c7dd79aa304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

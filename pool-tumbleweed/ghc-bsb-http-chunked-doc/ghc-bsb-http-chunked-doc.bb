SUMMARY = "Haskell bsb-http-chunked library documentation"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-doc-0.0.0.4-6.3.noarch.rpm"
RPM_HASH = "c91982961070c7d2a9ce5c68bf288f42d2ffbea329727057f3b10f04c6aca1932a56b2d2fb46d1ed44aa10402f02d49ce10037129da817c5670465a5314be6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

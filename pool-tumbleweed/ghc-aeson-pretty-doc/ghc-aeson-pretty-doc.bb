SUMMARY = "Haskell aeson-pretty library documentation"
DESCRIPTION = "This package provides the Haskell aeson-pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-doc-0.8.9-4.3.noarch.rpm"
RPM_HASH = "73074dc78b3845fa7f8b4a82ac71b2f9a9007cc4240ba7799a9ca61dd42705faa985c0baea7ec0658ae75576fa3203ff321a23ec1895792585a7c87e85b432b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

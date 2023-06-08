SUMMARY = "Haskell base64 library documentation"
DESCRIPTION = "This package provides the Haskell base64 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-doc-0.4.2.4-3.3.noarch.rpm"
RPM_HASH = "ec29f3cba5593d5d80205c83c9b29431c9b096f7ec4dd6c408c208c24af872c6d7f05adfdc081f4bce4374379b2c9845dac2ea3aba02512b53f1be65d252d7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell basement library documentation"
DESCRIPTION = "This package provides the Haskell basement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-doc-0.0.16-1.3.noarch.rpm"
RPM_HASH = "909288f3b6dfbfcf1eef50e8adae04ebc6bed66e86727adf3fb6029e414dc781370b24a0d8be324321bdc5122866dc70c7bff59b38b9c12bfd2b091fdf19343d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-basement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

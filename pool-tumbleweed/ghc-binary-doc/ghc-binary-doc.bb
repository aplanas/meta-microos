SUMMARY = "Haskell binary library documentation"
DESCRIPTION = "This package provides the Haskell binary library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-doc-0.8.9.1-3.1.noarch.rpm"
RPM_HASH = "383d9a459a8cf94d7c8106c8c1996c2f277fbda2c76d3fabc81e5a93f8d8deb5650330ca8fb8b7de11027293cb0c02350c85b1e2f4e99d356ffa8d52447006a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

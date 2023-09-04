SUMMARY = "Haskell aeson-pretty library documentation"
DESCRIPTION = "This package provides the Haskell aeson-pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-doc-0.8.10-1.4.noarch.rpm"
RPM_HASH = "ba6547344fdb7bf2b0c4ed602a11800823557ab7404f4b0f0a1de9a030d9fffcb9a7d1ede9707bd8478a46c9e1ac5cf4174d694f62c717f2e5e1e23fb443768e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

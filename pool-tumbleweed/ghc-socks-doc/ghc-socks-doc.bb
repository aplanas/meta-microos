SUMMARY = "Haskell socks library documentation"
DESCRIPTION = "This package provides the Haskell socks library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-doc-0.6.1-6.9.noarch.rpm"
RPM_HASH = "ab4bb59258da32446fc13f9116036fd893d3958c7e4e66914cdb291503d79ff9c3c0f28924f035c4dcbd07d2e2f78f802f5dedf52c2c7a3cb7fc56881beb5f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-socks-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell tls library documentation"
DESCRIPTION = "This package provides the Haskell tls library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-doc-1.6.0-2.6.noarch.rpm"
RPM_HASH = "fd98c50cc95333730f050c576b8e453e06c0b21d93065abebebffca30eafb0e5c1fd2d9c698928d17ce9305e22cbfd18198cce532518c58f4df3952b954e73d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

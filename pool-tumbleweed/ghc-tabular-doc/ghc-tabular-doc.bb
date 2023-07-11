SUMMARY = "Haskell tabular library documentation"
DESCRIPTION = "This package provides the Haskell tabular library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-doc-0.2.2.8-4.6.noarch.rpm"
RPM_HASH = "16affc9a23b72d52054051739a14af60869a6a5ccb31d8bc79fad6011b35e3cdc66bee6c76e4052271c7bfa4213571c09d9246225791ef1c46e4c99f5d362398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tabular-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

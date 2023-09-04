SUMMARY = "Haskell vector library documentation"
DESCRIPTION = "This package provides the Haskell vector library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-doc-0.13.0.0-3.2.noarch.rpm"
RPM_HASH = "cb797e3641e624cf0c0cb68526b757cf6f971b6c243326328add2e87d53f9509340b6cb631b88df592f5de901c77e7eb37cc21be491cfcb88bd4cbe6b8181c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

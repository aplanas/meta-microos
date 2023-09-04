SUMMARY = "Haskell microlens-th library documentation"
DESCRIPTION = "This package provides the Haskell microlens-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-doc-0.4.3.13-1.2.noarch.rpm"
RPM_HASH = "20781c01047f53f2e98aadb76c3f43fd80ce6696c593597fc7608db8d0ef6f65840c580cf03c57bed3f490c9e85b5afc7e10b167935dc0cadb274a9877aae29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

SUMMARY = "Haskell texmath library documentation"
DESCRIPTION = "This package provides the Haskell texmath library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "ghc-texmath-doc-0.12.8-1.4.noarch.rpm"
RPM_HASH = "a3383df1586b606108cf2329b167bbf293b5cc76fa91714286ec99421681ec9cc82608e26b818be040f684b49d0ede9ace046a0adbf2becb3ee469a4b9a0a43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-texmath-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

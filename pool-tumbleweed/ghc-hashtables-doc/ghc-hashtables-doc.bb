SUMMARY = "Haskell hashtables library documentation"
DESCRIPTION = "This package provides the Haskell hashtables library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-doc-1.3.1-1.6.noarch.rpm"
RPM_HASH = "42dfbe3a62847f5a5ab3c76102c74ea78e5f5fcb022ad92db25c12a0e27fa119eb32d8c0817c0416e646cf6303a146936a40f17c3ac4b8d0a8bca007eaae3e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

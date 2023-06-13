SUMMARY = "Haskell xml library documentation"
DESCRIPTION = "This package provides the Haskell xml library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-doc-1.3.14-13.3.noarch.rpm"
RPM_HASH = "d00a73439860e56c3430e7f5886ee2b5bd648146db7c9aabb2065b7623b2084cc18ae98a9dbf44a1c85a72b779da433aa775e30cfe56064456e5502d931cdd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

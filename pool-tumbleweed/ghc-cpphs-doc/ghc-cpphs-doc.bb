SUMMARY = "Haskell cpphs library documentation"
DESCRIPTION = "This package provides the Haskell cpphs library documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-doc-1.20.9.1-5.8.noarch.rpm"
RPM_HASH = "82d95b4185403bcb95a5481c9d57def2438f66cb6e780261ae903412c4e722603dd0ec78f1648aecf588d2084a5da12855db1cc9064b0d0e85c02c00e32dd183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cpphs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

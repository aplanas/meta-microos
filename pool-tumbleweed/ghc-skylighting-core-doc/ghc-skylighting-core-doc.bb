SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-skylighting-core-doc-0.13.4-1.1.noarch.rpm"
RPM_HASH = "884c5a0185ecd69d9ec4e6fce1961870b04817a62be4b3376de20612c4c4d52a0ec3dc2f45ba4a50e486aa3c6820849b2ba7581fd13abf75c776c80b879c240b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

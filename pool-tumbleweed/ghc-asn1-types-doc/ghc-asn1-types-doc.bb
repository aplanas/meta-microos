SUMMARY = "Haskell asn1-types library documentation"
DESCRIPTION = "This package provides the Haskell asn1-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-doc-0.3.4-5.8.noarch.rpm"
RPM_HASH = "d565264683bc10c32936bd1cf66cb150ecff108a3e1974adfa6523b0db29bf712772cc7294755b052b5171a45ad701dd31c8631a1d2220ddcd7fb602cab6a1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

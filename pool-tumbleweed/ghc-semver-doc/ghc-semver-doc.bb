SUMMARY = "Haskell semver library documentation"
DESCRIPTION = "This package provides the Haskell semver library documentation."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-doc-0.4.0.1-1.3.noarch.rpm"
RPM_HASH = "31cf1641968d0c6aa5c799493508bececceefb1cbbe66091230239a31792329cd2c7ab8fafb83b4497d5216204b7591748db8451e3f479f13145021f6269fe6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

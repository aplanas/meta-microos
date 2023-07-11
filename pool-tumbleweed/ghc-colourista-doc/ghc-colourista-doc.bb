SUMMARY = "Haskell colourista library documentation"
DESCRIPTION = "This package provides the Haskell colourista library documentation."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-doc-0.1.0.2-1.6.noarch.rpm"
RPM_HASH = "d6bd8e8cfbd98fe76a6ab97181e84935e0b6ccc83d5be3bef48d6b6ed6db9c2ec144463d95502cd142af3d90b9d86b4918f90dc3162e23419fae217dbe1007c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-colourista-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

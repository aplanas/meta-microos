SUMMARY = "Haskell hslua-marshalling library documentation"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-doc-2.3.0-1.6.noarch.rpm"
RPM_HASH = "1d851b1243ab1fa63d6662e610f9c1874dec806697f3ec58bcae8e4ee8013a9d3c316dea30b93c2f752da5f06b7e98288900ff01a4ff418656c260b51c6b63a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-marshalling-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

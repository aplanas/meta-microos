SUMMARY = "Haskell asn1-types library documentation"
DESCRIPTION = "This package provides the Haskell asn1-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-doc-0.3.4-5.6.noarch.rpm"
RPM_HASH = "db8a9b721f9cf50cefbedb04cb81d01daa218165113937d3e4758272b11ef183343e7dba7b86086d19f35f952877ddc99d14f96071a10404b3ce902f5941b87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

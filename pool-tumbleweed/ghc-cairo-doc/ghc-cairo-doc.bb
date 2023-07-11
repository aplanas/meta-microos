SUMMARY = "Haskell cairo library documentation"
DESCRIPTION = "This package provides the Haskell cairo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-doc-0.13.10.0-1.3.noarch.rpm"
RPM_HASH = "a6ddf5982e5f9fff73225997368ac986d5c7fc9a98c6c76151133367c45fb80b15620e5c3a49b2450c05db5b7c7e7c3c49e792258a1626c0b6e7adc49a84ea97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cairo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

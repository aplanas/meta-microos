SUMMARY = "Haskell asn1-parse library documentation"
DESCRIPTION = "This package provides the Haskell asn1-parse library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-doc-0.9.5-6.2.noarch.rpm"
RPM_HASH = "149d2e6b8f089f51f80d85c97959cfcba721eb78acbca4f785dad376be9eec3597a986b0fa68e31e7daf59507356f5ae6d7b723f86cf26d5eacf20f76ccb6edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-parse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

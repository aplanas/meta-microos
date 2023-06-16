SUMMARY = "Haskell th-lift library development files"
DESCRIPTION = "This package provides the Haskell th-lift library development files."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.3"

RPM_NAME = "ghc-th-lift-devel-0.8.3-1.2.aarch64.rpm"
RPM_HASH = "4ccb08e2e62bd3426ee6cf978a1187aef234c0a1a7550c9b15faf556d4b5a7ed6085d37089d2729ab5fe683933859e35ee02bdfc3777d12b2f99eb83137f992f"

RPROVIDES:${PN} += "ghc-devel-th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN \
ghc-th-lift-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-th-lift"

inherit rpm

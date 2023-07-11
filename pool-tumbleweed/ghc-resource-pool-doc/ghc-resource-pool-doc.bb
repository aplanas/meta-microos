SUMMARY = "Haskell resource-pool library documentation"
DESCRIPTION = "This package provides the Haskell resource-pool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-doc-0.4.0.0-2.6.noarch.rpm"
RPM_HASH = "d3bcdf1141331c3a7d77a97a3ec1a9252f147cc87e235a38123b3849eebaa7f9e3c74531f68478a0a908c6b79c1a9ac8d867297281983ddc82fb73edb6eeb755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resource-pool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm

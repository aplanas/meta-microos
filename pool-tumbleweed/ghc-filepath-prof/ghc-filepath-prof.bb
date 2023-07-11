SUMMARY = "Haskell filepath profiling library"
DESCRIPTION = "This package provides the Haskell filepath profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-prof-1.4.2.2-3.2.aarch64.rpm"
RPM_HASH = "df713c197f0af33ede044acf2f0c948e095c0a84ae5fd7c7546e65a23befc900abc75e4fe6cd3d287d79f6b50dc0c70668840c1f48675765672207bc7eb81fc5"

RPROVIDES:${PN} += "ghc-filepath-prof \
ghc-prof-filepath-1.4.2.2"

RDEPENDS:${PN} += "ghc-filepath-devel \
ghc-prof-base-4.17.1.0"

inherit rpm

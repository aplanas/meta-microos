SUMMARY = "Haskell void profiling library"
DESCRIPTION = "This package provides the Haskell void profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-prof-0.7.3-6.2.aarch64.rpm"
RPM_HASH = "c57da8953226bcfbc251ba642ce87968b743c27ef92f4c139c9893c4fd0676300314d84a728190f40d29106d5e2396a10b67ce9c923ec9c856e9d3438918fa26"

RPROVIDES:${PN} += "ghc-prof(void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz) \
ghc-void-prof \
ghc-void-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-void-devel"

inherit rpm

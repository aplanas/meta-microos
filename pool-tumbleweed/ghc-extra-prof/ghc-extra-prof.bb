SUMMARY = "Haskell extra profiling library"
DESCRIPTION = "This package provides the Haskell extra profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-prof-1.7.14-1.1.aarch64.rpm"
RPM_HASH = "c2e77ec0e0631bb77ae937f275d1c160fc2344fe018759515af3136f6997f840f2e639e440b61128ac130879b68b46831d2c1e219e410b28824d63d4306711c4"

RPROVIDES:${PN} += "ghc-extra-prof \
ghc-prof-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo"

RDEPENDS:${PN} += "ghc-extra-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm

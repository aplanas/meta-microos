SUMMARY = "Haskell gridtables profiling library"
DESCRIPTION = "This package provides the Haskell gridtables profiling library."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-prof-0.1.0.0-1.4.aarch64.rpm"
RPM_HASH = "cec3a3bac273058841610ad9784779b04063a38ac03f7758fffb30888442823733c854499a0590bbe5ec51c3dfcecf4db6eaa14b93728f1097fb1d7eada38e99"

RPROVIDES:${PN} += "ghc-gridtables-prof \
ghc-prof-gridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH"

RDEPENDS:${PN} += "ghc-gridtables-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm

SUMMARY = "Haskell hslua-list profiling library"
DESCRIPTION = "This package provides the Haskell hslua-list profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-prof-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "22464c505f654ee8843b5765885184d8054430743bdfd492cbb599ad3c76c47d17af957079581c38ea4045ba26a733a712c40c12faee6bb2fa9f055fc51596d3"

RPROVIDES:${PN} += "ghc-hslua-list-prof \
ghc-prof-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A"

RDEPENDS:${PN} += "ghc-hslua-list-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC"

inherit rpm

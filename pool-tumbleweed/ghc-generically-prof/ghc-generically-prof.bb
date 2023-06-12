SUMMARY = "Haskell generically profiling library"
DESCRIPTION = "This package provides the Haskell generically profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-prof-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "3611ffaac609f22b1050f9cfde43fd3d5bc72a8607d1a6b0c9f5b2340c64897352ea9f71fbb0532a19223adfb68281b3e0016e18b7035af1f9b5db43d815ad55"

RPROVIDES:${PN} += "ghc-generically-prof \
ghc-generically-prof(aarch-64) \
ghc-prof(generically-0.1.1-9IDkuVjdBOA27Mdybf3GBx)"
RDEPENDS:${PN} += "ghc-generically-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8)"

inherit rpm

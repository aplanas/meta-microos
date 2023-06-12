SUMMARY = "Haskell iproute profiling library"
DESCRIPTION = "This package provides the Haskell iproute profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-prof-1.7.12-2.3.aarch64.rpm"
RPM_HASH = "75d3a87389c83b5f385adbaf7297073adbd624da8fffa67437b2e2b8b4de3bd67ff26af112d449b5760f776acfbdddefe9eae95d989fd82a50e5d3b7c92c5fa9"

RPROVIDES:${PN} += "ghc-iproute-prof \
ghc-iproute-prof(aarch-64) \
ghc-prof(iproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd)"
RDEPENDS:${PN} += "ghc-iproute-devel \
ghc-prof(appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv) \
ghc-prof(base-4.17.1.0) \
ghc-prof(byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd)"

inherit rpm

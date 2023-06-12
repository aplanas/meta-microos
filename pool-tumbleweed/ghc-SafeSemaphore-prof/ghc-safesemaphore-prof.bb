SUMMARY = "Haskell SafeSemaphore profiling library"
DESCRIPTION = "This package provides the Haskell SafeSemaphore profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-prof-0.10.1-5.3.aarch64.rpm"
RPM_HASH = "6a3a9e3cd7451a5194f32ae47a2ce0e5f6af98da19546b5f1138a04bb2e067357059275ffe8e093fa6ea40c43c68d2eaf7d79c9ec22dcdd71ab1be7dfb702228"

RPROVIDES:${PN} += "ghc-SafeSemaphore-prof \
ghc-SafeSemaphore-prof(aarch-64) \
ghc-prof(SafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia)"
RDEPENDS:${PN} += "ghc-SafeSemaphore-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(stm-2.5.1.0)"

inherit rpm

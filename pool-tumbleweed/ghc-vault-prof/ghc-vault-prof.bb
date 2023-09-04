SUMMARY = "Haskell vault profiling library"
DESCRIPTION = "This package provides the Haskell vault profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-prof-0.3.1.5-4.9.aarch64.rpm"
RPM_HASH = "9550ed17ff83ff6e1e4318f9c7403577a3e3686de860c4f41963e67e66340cf70b1af3ab0a0831997ce13646d3e28fbdc6fd94c2812196117874a0afaf222113"

RPROVIDES:${PN} += "ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-vault-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-vault-devel"

inherit rpm

SUMMARY = "Haskell vault library development files"
DESCRIPTION = "This package provides the Haskell vault library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-devel-0.3.1.5-4.9.aarch64.rpm"
RPM_HASH = "92d32eb53a811d07cedb73c1582291c361c9ab877bbca9aeb49dd972f2d9ee3888615eab3df3e403c063a2d8ba1b2c89aedb8a9269193b9a2fbbbb5ddf24f77a"

RPROVIDES:${PN} += "ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-vault-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-vault"

inherit rpm

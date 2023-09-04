SUMMARY = "Haskell hashtables library development files"
DESCRIPTION = "This package provides the Haskell hashtables library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-devel-1.3.1-1.9.aarch64.rpm"
RPM_HASH = "0889add28c73973d27ca70dffbd6640a2f9a914794bda24c0e38ce13b1d26c2b710ede9aaa4cf6184af58b113f01cd33271b9a2dd47519c5a573ca0e84c83c56"

RPROVIDES:${PN} += "ghc-devel-hashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T \
ghc-hashtables-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-hashtables"

inherit rpm

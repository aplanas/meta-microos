SUMMARY = "Haskell microlens-platform profiling library"
DESCRIPTION = "This package provides the Haskell microlens-platform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-prof-0.4.3.3-2.6.aarch64.rpm"
RPM_HASH = "6a5b1dbfc22df0e94cf0576f91d85c28285c20df40706dd5404b04ffeaaf598b89e4df63d66ebf1fa71abeed72c74410bf4f147d09f1a537bafb614f4ea417c1"

RPROVIDES:${PN} += "ghc-microlens-platform-prof \
ghc-prof-microlens-platform-0.4.3.3-6gUOWhUsYyX8InoICo3xk0"

RDEPENDS:${PN} += "ghc-microlens-platform-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-microlens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89 \
ghc-prof-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm

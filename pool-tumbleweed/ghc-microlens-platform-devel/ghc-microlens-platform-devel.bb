SUMMARY = "Haskell microlens-platform library development files"
DESCRIPTION = "This package provides the Haskell microlens-platform library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-devel-0.4.3.3-2.6.aarch64.rpm"
RPM_HASH = "15b9ca1e28426717d6945f31717f35b09f9b81300f3967ef70c113caf53f3eed26b085df6832dc2bb4ecc0b35cb1015e14d39a72eda7b37a1ce3eef6ca5b807b"

RPROVIDES:${PN} += "ghc-devel-microlens-platform-0.4.3.3-6gUOWhUsYyX8InoICo3xk0 \
ghc-microlens-platform-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-microlens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89 \
ghc-devel-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-microlens-platform"

inherit rpm

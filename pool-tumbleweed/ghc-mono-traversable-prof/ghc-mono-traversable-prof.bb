SUMMARY = "Haskell mono-traversable profiling library"
DESCRIPTION = "This package provides the Haskell mono-traversable profiling library."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-prof-1.0.15.3-2.10.aarch64.rpm"
RPM_HASH = "484fe95bcd1dd93abe932d0c3940f0d7429e387d6a5157783b27e4fadf3ade86eddfb8f185a7a2dd87b76b068f804fe1b468c926a4d5e59e2700c5042ca000e8"

RPROVIDES:${PN} += "ghc-mono-traversable-prof \
ghc-prof-mono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW"

RDEPENDS:${PN} += "ghc-mono-traversable-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr"

inherit rpm

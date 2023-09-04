SUMMARY = "Haskell foldl profiling library"
DESCRIPTION = "This package provides the Haskell foldl profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.15"

RPM_NAME = "ghc-foldl-prof-1.4.15-1.4.aarch64.rpm"
RPM_HASH = "97283051dc59304e0fe31fc2a4f5e3ea762227f83e8176e1ef3643f73b083bcc9f05c01858c8d47a571121b00f81bdde7579f1051df92f3d99fdaf24c3cde94e"

RPROVIDES:${PN} += "ghc-foldl-prof \
ghc-prof-foldl-1.4.15-K48qSoToNSs4RlpGcmzHlW"

RDEPENDS:${PN} += "ghc-foldl-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm

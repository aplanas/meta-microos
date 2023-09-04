SUMMARY = "Haskell foldl library development files"
DESCRIPTION = "This package provides the Haskell foldl library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.15"

RPM_NAME = "ghc-foldl-devel-1.4.15-1.4.aarch64.rpm"
RPM_HASH = "740379342c403c4c466b03259d86fc4a43bcfba49ff680de4159d7007eff9f1e623184a53c7396e766c4bfb6ddac5c8539bb804bf77e967157ab35668199ddac"

RPROVIDES:${PN} += "ghc-devel-foldl-1.4.15-K48qSoToNSs4RlpGcmzHlW \
ghc-foldl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-foldl"

inherit rpm

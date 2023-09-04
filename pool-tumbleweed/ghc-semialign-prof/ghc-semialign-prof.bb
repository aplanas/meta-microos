SUMMARY = "Haskell semialign profiling library"
DESCRIPTION = "This package provides the Haskell semialign profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-prof-1.3-1.6.aarch64.rpm"
RPM_HASH = "1e14da817e977518a1d154bca5d7355f9cdc5e923979d964fa0ffc2f345e7fe3cbf9e95c321d50d4f7341ea5b4838db84ef4dd0437cd3ee2c1b0d98ed453565c"

RPROVIDES:${PN} += "ghc-prof-semialign-1.3-6anmyujTzjW8JKdJGWMlmE \
ghc-semialign-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-semialign-devel"

inherit rpm

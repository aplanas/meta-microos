SUMMARY = "Haskell semialign library development files"
DESCRIPTION = "This package provides the Haskell semialign library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-devel-1.3-1.6.aarch64.rpm"
RPM_HASH = "4272337a108b419afda4f1ca3c4694f2ebbb744cd988b4a074c43ffc903e67008c67999d5864614226785a4f7cd56160ecdd572989227cdad9ab002a230f21ce"

RPROVIDES:${PN} += "ghc-devel-semialign-1.3-6anmyujTzjW8JKdJGWMlmE \
ghc-semialign-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-semialign"

inherit rpm

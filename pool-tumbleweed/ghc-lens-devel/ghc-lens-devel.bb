SUMMARY = "Haskell lens library development files"
DESCRIPTION = "This package provides the Haskell lens library development files."
LICENSE = "BSD-2-Clause"

PV = "5.2.3"

RPM_NAME = "ghc-lens-devel-5.2.3-1.1.aarch64.rpm"
RPM_HASH = "2316c6e0ec9a08bc1ecc510af16f8f4e99e93713733a4912b6ebacd550159bd7d25f5a478876eae939de509428925d963b8c9dd8b8831d9403615380bb479eb7"

RPROVIDES:${PN} += "ghc-devel-lens-5.2.3-77wBUrzlfuWHQNAaqkfvdZ \
ghc-lens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-devel-kan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy \
ghc-devel-mtl-2.2.2 \
ghc-devel-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-reflection-2.1.7-1WygFxHmxkcEQBv8T6gHut \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-lens"

inherit rpm

SUMMARY = "Haskell lens profiling library"
DESCRIPTION = "This package provides the Haskell lens profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-prof-5.2.2-2.4.aarch64.rpm"
RPM_HASH = "850e28847407d2b8dc520995beb7af9fade5f96fbd968fbdc97684da91ad99448500f4aac8a8873065f384b699df959611c3d2e93fef7fde79de0f8b70795f78"

RPROVIDES:${PN} += "ghc-lens-prof \
ghc-prof-lens-5.2.2-9FQiMfULngUCqLz60VkKPe"

RDEPENDS:${PN} += "ghc-lens-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-indexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ \
ghc-prof-kan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy \
ghc-prof-mtl-2.2.2 \
ghc-prof-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-reflection-2.1.7-1WygFxHmxkcEQBv8T6gHut \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm

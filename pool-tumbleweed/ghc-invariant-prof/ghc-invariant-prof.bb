SUMMARY = "Haskell invariant profiling library"
DESCRIPTION = "This package provides the Haskell invariant profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-invariant-prof-0.6.2-1.2.aarch64.rpm"
RPM_HASH = "cf52f5172ed639064fcc8670f1da1cbb007be13143d90e1546d24731d7be181bec58301881e5018df548242001344a631c3e15a899692af7fc1d47c6fa40ffe1"

RPROVIDES:${PN} += "ghc-invariant-prof \
ghc-prof-invariant-0.6.2-1eF4QVqz69AFovgmNz4wk7"

RDEPENDS:${PN} += "ghc-invariant-devel \
ghc-prof-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn"

inherit rpm

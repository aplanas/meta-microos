SUMMARY = "Haskell invariant library development files"
DESCRIPTION = "This package provides the Haskell invariant library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-invariant-devel-0.6.2-1.2.aarch64.rpm"
RPM_HASH = "f30f793a33939beae3e52c5ef1cc611ea93bc23b91b8cec89066f64b06132953aa629107acc67816f13218a91885d3ee2b54d3abc0388560071586bcbf770ce5"

RPROVIDES:${PN} += "ghc-devel-invariant-0.6.2-1eF4QVqz69AFovgmNz4wk7 \
ghc-invariant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-invariant"

inherit rpm

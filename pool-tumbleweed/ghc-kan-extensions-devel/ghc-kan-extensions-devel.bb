SUMMARY = "Haskell kan-extensions library development files"
DESCRIPTION = "This package provides the Haskell kan-extensions library development files."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-devel-5.2.5-2.9.aarch64.rpm"
RPM_HASH = "b99ce11366e562688b6320a17d6bf424afbf339713e54a4dca4c99a834d55b08142ba7d57e3cb137f982165f0def46615b3bfb8b433726ef22936636367a7d4b"

RPROVIDES:${PN} += "ghc-devel-kan-extensions-5.2.5-8EOcrvzPSBS2QFPhIHEfWy \
ghc-kan-extensions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-adjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-devel-invariant-0.6.2-1eF4QVqz69AFovgmNz4wk7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-kan-extensions"

inherit rpm

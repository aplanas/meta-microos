SUMMARY = "Haskell adjunctions profiling library"
DESCRIPTION = "This package provides the Haskell adjunctions profiling library."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-prof-4.4.2-2.9.aarch64.rpm"
RPM_HASH = "0cbfbf798f13609b2420817b76fb4704546253931d17d9e4701b450073c2fbe6f0496b933c654863cac1362b459872676d7cf36ad3d8a66db844c5534c890fdc"

RPROVIDES:${PN} += "ghc-adjunctions-prof \
ghc-prof-adjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3"

RDEPENDS:${PN} += "ghc-adjunctions-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-prof-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-prof-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-prof-semigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0"

inherit rpm

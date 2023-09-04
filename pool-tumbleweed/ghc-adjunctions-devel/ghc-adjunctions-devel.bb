SUMMARY = "Haskell adjunctions library development files"
DESCRIPTION = "This package provides the Haskell adjunctions library development files."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-devel-4.4.2-2.9.aarch64.rpm"
RPM_HASH = "1828236aaa6e323cc311f1a156baf1db1b1cd2eb5121e2f5ef8bd5a7494061379f4304e9669bb26e6c0e7e111ee5b804210cb633842380e966cf9bc64b022528"

RPROVIDES:${PN} += "ghc-adjunctions-devel \
ghc-devel-adjunctions-4.4.2-BjNTDSboJHWDpWX9BvuZL3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-adjunctions \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-free-5.1.10-8DOWW3JiZaX7obxPZwBWX0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-profunctors-5.6.2-GfNUFxHNpLn859duquR0iv \
ghc-devel-semigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g \
ghc-devel-semigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-void-0.7.3-GhXmDKlBHl0LbXoxVMxAU0"

inherit rpm

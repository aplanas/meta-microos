SUMMARY = "Haskell comonad library development files"
DESCRIPTION = "This package provides the Haskell comonad library development files."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-devel-5.0.8-3.9.aarch64.rpm"
RPM_HASH = "5672519f583db59e526e785b8085e64e9d811a2f18ad34d7773bb9c15ebd852689699db6bc40af7fb40aa16385df48de1624dda586adb6727e8d6712c598ae66"

RPROVIDES:${PN} += "ghc-comonad-devel \
ghc-devel-comonad-5.0.8-56nFbOwllOwBl7FMfSy83E"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-comonad \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM"

inherit rpm

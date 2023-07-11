SUMMARY = "Haskell xmonad library development files"
DESCRIPTION = "This package provides the Haskell xmonad library development files."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-devel-0.17.2-1.6.aarch64.rpm"
RPM_HASH = "cb9594de2c4f11da6f91d8269fee3b894908ac04d0fa60384ec9f9d4ae82998fc468437ecf11c25e756e50dadf19996af74a585ea8a5338c7d0a988e9d63a7a0"

RPROVIDES:${PN} += "ghc-devel-xmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I \
ghc-xmonad-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-setlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-xmonad"

inherit rpm

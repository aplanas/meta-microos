SUMMARY = "Haskell xmonad profiling library"
DESCRIPTION = "This package provides the Haskell xmonad profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-prof-0.17.2-1.6.aarch64.rpm"
RPM_HASH = "91de53c165a746b5429740c8609e57ec6bf2e1a751fa5675cf87b619db7c910da13261023e017818be1feb17f59b6c0db9c8c10884aefd6f5261929a507aa6d9"

RPROVIDES:${PN} += "ghc-prof-xmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I \
ghc-xmonad-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-setlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-xmonad-devel"

inherit rpm

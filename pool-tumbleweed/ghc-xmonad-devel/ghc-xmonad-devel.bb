SUMMARY = "Haskell xmonad library development files"
DESCRIPTION = "This package provides the Haskell xmonad library development files."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-devel-0.17.2-1.3.aarch64.rpm"
RPM_HASH = "7915a47434d8dcd31faa281a1b33d442b8786d828b058c8eccd5c11ef3326366b8468d89ed28d40175027f9ea9c87b01dcd08da68f3670b451b44c575faf1475"

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

SUMMARY = "Haskell xmonad-contrib profiling library"
DESCRIPTION = "This package provides the Haskell xmonad-contrib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-prof-0.17.1-3.4.aarch64.rpm"
RPM_HASH = "61ef186feaf806bd28d6c70f9ef928c340f0b05bd65cdfa06b6f3597cfe08688eaf2977ef7b2c538b454b0d7b7140c5e1d3270017dcbc4f2bcf9b9416f57810a"

RPROVIDES:${PN} += "ghc-prof-xmonad-contrib-0.17.1-4q9MntM3g8MH8PR7JoUT1u \
ghc-xmonad-contrib-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX \
ghc-prof-X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-xmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I \
ghc-xmonad-contrib-devel"

inherit rpm

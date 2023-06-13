SUMMARY = "Haskell xmonad-contrib library development files"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.17.1"

RPM_NAME = "ghc-xmonad-contrib-devel-0.17.1-3.4.aarch64.rpm"
RPM_HASH = "8771c47e6f98f4ea617a9e32b86e58a2fe7dc50602c820cbbd645d1be1551ccbd7166801d3cb9c00f00e02846868f9c473dfb8ac9e91e65524e7e0cc8c850263"

RPROVIDES:${PN} += "ghc-devel(xmonad-contrib-0.17.1-4q9MntM3g8MH8PR7JoUT1u) \
ghc-xmonad-contrib-devel \
ghc-xmonad-contrib-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX) \
ghc-devel(X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(process-1.6.16.0) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(time-1.12.2) \
ghc-devel(unix-2.7.3) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(xmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I) \
ghc-xmonad-contrib"

inherit rpm

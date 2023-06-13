SUMMARY = "Haskell xmonad profiling library"
DESCRIPTION = "This package provides the Haskell xmonad profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "ghc-xmonad-prof-0.17.2-1.3.aarch64.rpm"
RPM_HASH = "66b9742dfc63e327b9f48e70d851a41fb00f4aca1a86ac55bacdde111929a31cac740cdff0cfbb2d360025d6eaa489d89f40769675c5b5f45aa385a8201b1c35"

RPROVIDES:${PN} += "ghc-prof(xmonad-0.17.2-J64iMqERQ1Q7QqR5Vl2D4I) \
ghc-xmonad-prof \
ghc-xmonad-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(process-1.6.16.0) \
ghc-prof(setlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3) \
ghc-xmonad-devel"

inherit rpm

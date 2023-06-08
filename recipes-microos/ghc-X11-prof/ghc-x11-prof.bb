SUMMARY = "Haskell X11 profiling library"
DESCRIPTION = "This package provides the Haskell X11 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-prof-1.10.3-2.3.aarch64.rpm"
RPM_HASH = "97cbfa001a988593b6a7c212cea4c3c67eef329e8f3791df25e8844898e4a1e3b39c193ae6e87fea021cae825254c482d87b4defaab426bce4ca38bac640c045"

RPROVIDES:${PN} += "ghc-X11-prof ghc-X11-prof(aarch-64) ghc-prof(X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX)"
RDEPENDS:${PN} += "ghc-X11-devel ghc-prof(base-4.17.1.0) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ)"

inherit rpm

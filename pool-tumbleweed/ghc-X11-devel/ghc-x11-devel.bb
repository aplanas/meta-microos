SUMMARY = "Haskell X11 library development files"
DESCRIPTION = "This package provides the Haskell X11 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-devel-1.10.3-2.3.aarch64.rpm"
RPM_HASH = "f432ee17c07f0f6bc15d10f6740ab687dca74e6362c699dd3cbae193f583816e048f14ec02ac8d63878276ecf198e8771018bfaa14fb16676a4cbceb0869729c"

RPROVIDES:${PN} += "ghc-X11-devel \
ghc-devel-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX"

RDEPENDS:${PN} += "/bin/sh \
ghc-X11 \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-xext \
pkgconfig-xinerama \
pkgconfig-xrandr \
pkgconfig-xscrnsaver"

inherit rpm

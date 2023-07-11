SUMMARY = "Haskell X11 library development files"
DESCRIPTION = "This package provides the Haskell X11 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-devel-1.10.3-2.6.aarch64.rpm"
RPM_HASH = "b934f2b26df2d5c7864e39cba3c18c07601e4709ef34303d1cc9659d77515299659aa2e51186a6acdae205a80469a2ba1437fe65bed4458931b8d9b80b88ceb1"

RPROVIDES:${PN} += "ghc-X11-devel \
ghc-devel-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX"

RDEPENDS:${PN} += "/usr/bin/sh \
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

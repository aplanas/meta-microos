SUMMARY = "Haskell X11 library development files"
DESCRIPTION = "This package provides the Haskell X11 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-devel-1.10.3-2.8.aarch64.rpm"
RPM_HASH = "dca86b9d8b671564f767c02273c20d7df0637ee94f5303d4eae7e6c45b03a20803e9fb40d3ec6c7e50f1e788f10d9e9b869bba36bdcf57767de9fce190def346"

RPROVIDES:${PN} += "ghc-X11-devel \
ghc-devel-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-X11 \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-xext \
pkgconfig-xinerama \
pkgconfig-xrandr \
pkgconfig-xscrnsaver"

inherit rpm

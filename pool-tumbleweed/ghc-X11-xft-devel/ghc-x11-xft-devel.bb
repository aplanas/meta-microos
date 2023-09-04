SUMMARY = "Haskell X11-xft library development files"
DESCRIPTION = "This package provides the Haskell X11-xft library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-devel-0.3.4-2.3.aarch64.rpm"
RPM_HASH = "79459cbd3a97cba5b5e93bf7a1482ee28bf499c440931e7e99763846b232470611b30768bd98df5103a3ad7193f6921f6dcfeed5b774033e7cfe9c706cc6c09f"

RPROVIDES:${PN} += "ghc-X11-xft-devel \
ghc-devel-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-X11-xft \
ghc-compiler \
ghc-devel-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-devel-base-4.17.2.0 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
pkgconfig \
pkgconfig-xft"

inherit rpm

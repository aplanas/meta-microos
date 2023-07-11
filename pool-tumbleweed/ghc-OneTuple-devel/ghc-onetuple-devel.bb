SUMMARY = "Haskell OneTuple library development files"
DESCRIPTION = "This package provides the Haskell OneTuple library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-OneTuple-devel-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "f61ff8720890683b6c0f80cdf1f1dc2c7ef21aaf65cf9d88feb3bd209371c0534463563fb41d14da7f4ed515ca79704ea7d458f808419f35c5136938c3196cf3"

RPROVIDES:${PN} += "ghc-OneTuple-devel \
ghc-devel-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-OneTuple \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm

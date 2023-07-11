SUMMARY = "Haskell auto-update library development files"
DESCRIPTION = "This package provides the Haskell auto-update library development files."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-devel-0.1.6-6.6.aarch64.rpm"
RPM_HASH = "21c6a69cfb2c3625990893eb0a303fc7fe89b7021a5ce71e4037e70e04f1c02f1d863d5b2b03ca604d9648a75a1db80d092595be878e7468cd1ae91f9b90f2af"

RPROVIDES:${PN} += "ghc-auto-update-devel \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-auto-update \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm

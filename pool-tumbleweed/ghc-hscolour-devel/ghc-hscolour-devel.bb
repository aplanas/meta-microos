SUMMARY = "Haskell hscolour library development files"
DESCRIPTION = "This package provides the Haskell hscolour library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-devel-1.24.4-4.6.aarch64.rpm"
RPM_HASH = "b46d5fafa58782f562942137675f658cc9c7b0f5955aacc7cf56c9ce3ad8e3333f3166857be95a5819d14a47f1b580eeca28dbc4a7ca23e11c5ed39f7fcf369e"

RPROVIDES:${PN} += "ghc-devel-hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka \
ghc-hscolour-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-hscolour"

inherit rpm

SUMMARY = "Haskell hjsmin library development files"
DESCRIPTION = "This package provides the Haskell hjsmin library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-devel-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "6794b82ab18e5e89b10a33c6ba79244ff827d2a58d5a651ffc32fe723c02479ddcb8fd6efc6c535a8b26773157a0db2a972c322e9c38fec2817c97b0efbab0a2"

RPROVIDES:${PN} += "ghc-devel-hjsmin-0.2.1-G11T0ofJtyz5gQQf6GRgL1 \
ghc-hjsmin-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM \
ghc-devel-text-2.0.2 \
ghc-hjsmin"

inherit rpm

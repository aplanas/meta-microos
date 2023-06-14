SUMMARY = "Haskell parsec-numbers library development files"
DESCRIPTION = "This package provides the Haskell parsec-numbers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-devel-0.1.0-7.2.aarch64.rpm"
RPM_HASH = "e85ed6f6aa229c9e16e2a3a25e20377f7aec3d51be16e028e31091e818288652aea9a61915ae423bc0b2d95efdc11379e51f78976f200657eef3798b36028bf4"

RPROVIDES:${PN} += "ghc-devel-parsec-numbers-0.1.0-EpxP3vMK5SifJrb3FqKTJ \
ghc-parsec-numbers-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-parsec-numbers"

inherit rpm

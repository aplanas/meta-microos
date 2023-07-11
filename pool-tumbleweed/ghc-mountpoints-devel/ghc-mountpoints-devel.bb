SUMMARY = "Haskell mountpoints library development files"
DESCRIPTION = "This package provides the Haskell mountpoints library development files."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-devel-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "c6e1c99d19b3f61c62fc37fab450ae03e4f39a2ccd7ef8a447b9eb93e7d1d7f3172a9a9b26ea8419c2aa457a494503eac10554628175760e30f18caba48ead9f"

RPROVIDES:${PN} += "ghc-devel-mountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD \
ghc-mountpoints-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-mountpoints"

inherit rpm

SUMMARY = "Haskell utility-ht library development files"
DESCRIPTION = "This package provides the Haskell utility-ht library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-devel-0.0.17-1.5.aarch64.rpm"
RPM_HASH = "dea1b0bc1d82104783ddbafab72351c88623ce29a6bf55e44dfba7dfe64b63878db6a3be88d7dd7aa1a39ab4279d18e751ce7489f8f96b68d99d63912b38f09e"

RPROVIDES:${PN} += "ghc-devel-utility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62 \
ghc-utility-ht-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-utility-ht"

inherit rpm

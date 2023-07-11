SUMMARY = "Haskell utility-ht library development files"
DESCRIPTION = "This package provides the Haskell utility-ht library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-devel-0.0.17-1.3.aarch64.rpm"
RPM_HASH = "2cabf87bc362c2b163ac2056191c061700ecb0ce82f8bd2e482d22b25b5ca5e78c0bd1ace9bfa7ad9d013da57ff76d62fc46506cbf3ac3765e16518c3739dcd4"

RPROVIDES:${PN} += "ghc-devel-utility-ht-0.0.17-3onflAp0qnlITa4Vy6FXwy \
ghc-utility-ht-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-utility-ht"

inherit rpm

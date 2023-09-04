SUMMARY = "Haskell data-fix library development files"
DESCRIPTION = "This package provides the Haskell data-fix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.2"

RPM_NAME = "ghc-data-fix-devel-0.3.2-4.4.aarch64.rpm"
RPM_HASH = "2d87f3d3deded1b02fd0bfff126fd4687644c5f701cc9d83654a4f06b79b281b04a62df0870877feca419dbf442290b0cc2a045434d9fcff4e8c286159d2e53a"

RPROVIDES:${PN} += "ghc-data-fix-devel \
ghc-devel-data-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-fix \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP"

inherit rpm

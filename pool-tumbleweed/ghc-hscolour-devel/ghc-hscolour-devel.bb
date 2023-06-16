SUMMARY = "Haskell hscolour library development files"
DESCRIPTION = "This package provides the Haskell hscolour library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-devel-1.24.4-4.3.aarch64.rpm"
RPM_HASH = "3991f5100a0aea9a3de78e4101bee17e1e2ca1df51fa3f7f2d3cf2a91fc3e688930acb6f46adeb5412f6f98829841275b5cea55e4ea341463154780c4fa5145c"

RPROVIDES:${PN} += "ghc-devel-hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka \
ghc-hscolour-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-hscolour"

inherit rpm

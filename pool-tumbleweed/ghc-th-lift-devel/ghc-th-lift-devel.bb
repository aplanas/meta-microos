SUMMARY = "Haskell th-lift library development files"
DESCRIPTION = "This package provides the Haskell th-lift library development files."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.4"

RPM_NAME = "ghc-th-lift-devel-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "630f6a2f55e1eb2eff4644315b3e2a7c85fa4803d4eee8a5f9b80b0e9c24b6226a64c79a37fc89b69b4d432406c8b4d0b7eba53d6a9f9a7f009129f926f35eb2"

RPROVIDES:${PN} += "ghc-devel-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-th-lift-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-th-lift"

inherit rpm

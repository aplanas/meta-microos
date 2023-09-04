SUMMARY = "Haskell th-abstraction library development files"
DESCRIPTION = "This package provides the Haskell th-abstraction library development files."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-devel-0.4.5.0-2.8.aarch64.rpm"
RPM_HASH = "c9e509c2ce59af81dbd2e65b8d40f6c712a0dcee0d97f6c53fe9870a162d5d3a8a0c450ff8caf8f24665da5ab4938644970b713ea8655226da31e2dff51fa669"

RPROVIDES:${PN} += "ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-th-abstraction-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-th-abstraction"

inherit rpm

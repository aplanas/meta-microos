SUMMARY = "Haskell mime-types library development files"
DESCRIPTION = "This package provides the Haskell mime-types library development files."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-devel-0.1.1.0-2.2.aarch64.rpm"
RPM_HASH = "2a9845a194c0c3813196db844aec82b292128378a11ead87e11d8b32cc2e237d5c62da0743cba6ed952fdaad804dd5c17814e473e69f9d3d5dd7a03e8c79859c"

RPROVIDES:${PN} += "ghc-devel-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-mime-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-mime-types"

inherit rpm

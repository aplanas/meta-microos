SUMMARY = "Haskell text-short library development files"
DESCRIPTION = "This package provides the Haskell text-short library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-devel-0.1.5-3.3.aarch64.rpm"
RPM_HASH = "14567300014690f302b70c981120975e4c4e7bb5be2a5926db2d6a87aa6e5a2e260cd3c410ea04108e5625991b4aa38f9730222ef71837c65dba34d30840da8f"

RPROVIDES:${PN} += "ghc-devel(text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2) \
ghc-text-short-devel \
ghc-text-short-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-text-short"

inherit rpm

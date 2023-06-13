SUMMARY = "Distributive functors -- Dual to Traversable"
DESCRIPTION = "Distributive functors -- Dual to 'Traversable'."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-0.6.2.1-3.2.aarch64.rpm"
RPM_HASH = "54c623a060c3a5d9c0f57c3e1ab9f266d00bbb33dc06271e6341c3ed4a08ab54c6758980e528b795037dd4cd1aeee4da2c711bd73c5d711689ce04195798ae43"

RPROVIDES:${PN} += "ghc-distributive \
ghc-distributive(aarch-64) \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

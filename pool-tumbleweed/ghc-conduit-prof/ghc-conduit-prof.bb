SUMMARY = "Haskell conduit profiling library"
DESCRIPTION = "This package provides the Haskell conduit profiling library."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-prof-1.3.5-1.3.aarch64.rpm"
RPM_HASH = "2481c017387f6416d744bd68bc06fcfc0b816449199647b2c605204043ee46a5914ec04c3c9437e0f196f82726433cc808080106d2ae286c312b74748e7c5401"

RPROVIDES:${PN} += "ghc-conduit-prof \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr"

RDEPENDS:${PN} += "ghc-conduit-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S \
ghc-prof-mtl-2.2.2 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm

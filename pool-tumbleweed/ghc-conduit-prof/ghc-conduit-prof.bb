SUMMARY = "Haskell conduit profiling library"
DESCRIPTION = "This package provides the Haskell conduit profiling library."
LICENSE = "MIT"

PV = "1.3.4.3"

RPM_NAME = "ghc-conduit-prof-1.3.4.3-3.3.aarch64.rpm"
RPM_HASH = "2c1a9e329253a6b1d58ccca871ca827d2defceeea29ba429e6e8c3829306739f058198f994b44700d61a76bd40b843fd407e44d574255315e99252e85f4a3bcc"

RPROVIDES:${PN} += "ghc-conduit-prof \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2"

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

SUMMARY = "Haskell control-monad-free profiling library"
DESCRIPTION = "This package provides the Haskell control-monad-free profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-prof-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "3d946b7d36d93c481902c665abda66aba01515b7320ac3d6f3aed503e66724dd1f5ca3333e264375c96f7b3acd83e546d1fa0d4104e87d0b6967822b75e1f40b"

RPROVIDES:${PN} += "ghc-control-monad-free-prof \
ghc-prof-control-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6"

RDEPENDS:${PN} += "ghc-control-monad-free-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

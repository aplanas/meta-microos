SUMMARY = "Haskell control-monad-free profiling library"
DESCRIPTION = "This package provides the Haskell control-monad-free profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-prof-0.6.2-4.6.aarch64.rpm"
RPM_HASH = "3eaa7d906bd9bb8d805edf4403c2de4d3d8c767bab30c2dccceba8e17e1eed792b0e2c0426ae7c6518a2bcf8e79ec3d84e830cbfdec1cbb02b7810a1c3df70cf"

RPROVIDES:${PN} += "ghc-control-monad-free-prof \
ghc-prof-control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7"

RDEPENDS:${PN} += "ghc-control-monad-free-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

SUMMARY = "Haskell control-monad-free profiling library"
DESCRIPTION = "This package provides the Haskell control-monad-free profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-prof-0.6.2-4.3.aarch64.rpm"
RPM_HASH = "c74c2048488652d07b39df1d5bf508cec31d780bab26c6be589062ede98281ac35fca50acb01f135da51bdba99f3ca80e2af9a8b5155a1f86c5b40127c4fb356"

RPROVIDES:${PN} += "ghc-control-monad-free-prof ghc-control-monad-free-prof(aarch-64) ghc-prof(control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7)"
RDEPENDS:${PN} += "ghc-control-monad-free-devel ghc-prof(base-4.17.1.0) ghc-prof(transformers-0.5.6.2)"

inherit rpm

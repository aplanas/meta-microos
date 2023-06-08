SUMMARY = "Haskell directory profiling library"
DESCRIPTION = "This package provides the Haskell directory profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-prof-1.3.7.1-1.1.aarch64.rpm"
RPM_HASH = "1233dc0790894e75a371ca4d738f35ba31f64ca69317494e9d5616c5ca7de86dc65e8cc33475ce266f5665d4b55d24605205db0fc3dfa70153236068e960711d"

RPROVIDES:${PN} += "ghc-directory-prof ghc-directory-prof(aarch-64) ghc-prof(directory-1.3.7.1)"
RDEPENDS:${PN} += "ghc-directory-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(filepath-1.4.2.2) ghc-prof(time-1.12.2) ghc-prof(unix-2.7.3)"

inherit rpm

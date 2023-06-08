SUMMARY = "Haskell hpc profiling library"
DESCRIPTION = "This package provides the Haskell hpc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-prof-0.6.1.0-1.1.aarch64.rpm"
RPM_HASH = "72c8cd2c9cf0e0f317725242a411d636129f12eb45aff882c3c52508d7512d23a15cc3144ffcf0cdc309d7725dee758225da21ccdec1d90de7664c454dd25d53"

RPROVIDES:${PN} += "ghc-hpc-prof ghc-hpc-prof(aarch-64) ghc-prof(hpc-0.6.1.0)"
RDEPENDS:${PN} += "ghc-hpc-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(time-1.12.2)"

inherit rpm

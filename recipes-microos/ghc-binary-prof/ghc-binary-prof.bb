SUMMARY = "Haskell binary profiling library"
DESCRIPTION = "This package provides the Haskell binary profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-prof-0.8.9.1-3.1.aarch64.rpm"
RPM_HASH = "5f45add7fc0bb36b5974d87abe4a1c5a5ab545d45da0148a521ed930feb18c78b3c5fe74c22a19dd9ccf280e1d4d81145341b2b3a66dd7d6b7e89ea3174b6e50"

RPROVIDES:${PN} += "ghc-binary-prof ghc-binary-prof(aarch-64) ghc-prof(binary-0.8.9.1)"
RDEPENDS:${PN} += "ghc-binary-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7)"

inherit rpm

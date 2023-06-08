SUMMARY = "Haskell process profiling library"
DESCRIPTION = "This package provides the Haskell process profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-prof-1.6.16.0-1.1.aarch64.rpm"
RPM_HASH = "47f9d9ab460ed2e7cbdeecbb9dc4c5dc30951727e2bd7d862db4d2ca92720802362987636deea2f1a002088d1c6bf80ca9145db6a3122529241ad9a028d2f491"

RPROVIDES:${PN} += "ghc-process-prof ghc-process-prof(aarch-64) ghc-prof(process-1.6.16.0)"
RDEPENDS:${PN} += "ghc-process-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(unix-2.7.3)"

inherit rpm

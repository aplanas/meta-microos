SUMMARY = "Haskell haskeline profiling library"
DESCRIPTION = "This package provides the Haskell haskeline profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-prof-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "102f2a1bebd0536ef8d2df2c776fa60a64c60bd43b9fd13e9c8fc23147ea8f6eb9073640e2d40801f84dda2349c011bdb393c513ebffd8c77c4992e541975513"

RPROVIDES:${PN} += "ghc-haskeline-prof ghc-haskeline-prof(aarch-64) ghc-prof(haskeline-0.8.2)"
RDEPENDS:${PN} += "ghc-haskeline-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(directory-1.3.7.1) ghc-prof(exceptions-0.10.5) ghc-prof(filepath-1.4.2.2) ghc-prof(process-1.6.16.0) ghc-prof(stm-2.5.1.0) ghc-prof(terminfo-0.4.1.5) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3)"

inherit rpm

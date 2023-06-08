SUMMARY = "Haskell ghc profiling library"
DESCRIPTION = "This package provides the Haskell ghc profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-prof-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "836f2111d4d454631a6c728c4493bea89c01e5ae9610b1640c7361cfef26f1e354befec1f238d262657a0ca6dbe88467b1a5f568779440b9ab46093cb01cec89"

RPROVIDES:${PN} += "ghc-ghc-prof ghc-ghc-prof(aarch-64) ghc-prof(ghc-9.4.5)"
RDEPENDS:${PN} += "ghc-ghc-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(exceptions-0.10.5) ghc-prof(filepath-1.4.2.2) ghc-prof(ghc-boot-9.4.5) ghc-prof(ghc-heap-9.4.5) ghc-prof(ghci-9.4.5) ghc-prof(hpc-0.6.1.0) ghc-prof(process-1.6.16.0) ghc-prof(stm-2.5.1.0) ghc-prof(template-haskell-2.19.0.0) ghc-prof(terminfo-0.4.1.5) ghc-prof(time-1.12.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3)"

inherit rpm

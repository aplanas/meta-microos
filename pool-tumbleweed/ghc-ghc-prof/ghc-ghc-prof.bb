SUMMARY = "Haskell ghc profiling library"
DESCRIPTION = "This package provides the Haskell ghc profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "8bf2b60660e28acb129313cd2ccb15309a76592d70df3671d60e643d35384f45ee07dcc9fdc6d5c95bae3e34b04b19e2e4a39ead7e81cfba242c79beb5096f04"

RPROVIDES:${PN} += "ghc-ghc-prof \
ghc-ghc-prof(aarch-64) \
ghc-prof(ghc-9.4.5)"

RDEPENDS:${PN} += "ghc-ghc-devel(aarch-64) \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(ghc-boot-9.4.5) \
ghc-prof(ghc-heap-9.4.5) \
ghc-prof(ghci-9.4.5) \
ghc-prof(hpc-0.6.1.0) \
ghc-prof(process-1.6.16.0) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(terminfo-0.4.1.5) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3)"

inherit rpm

SUMMARY = "Haskell haskeline profiling library"
DESCRIPTION = "This package provides the Haskell haskeline profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-prof-0.8.2-3.1.aarch64.rpm"
RPM_HASH = "a6b7d186c8391c69f86939fb949aced020123a69b143d22f469cc72f87345e38da08cb8c5d4161c2b58c55f823854f243b0c33f24018e9a0071a0fe20513f0f6"

RPROVIDES:${PN} += "ghc-haskeline-prof \
ghc-haskeline-prof(aarch-64) \
ghc-prof(haskeline-0.8.2)"

RDEPENDS:${PN} += "ghc-haskeline-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(process-1.6.16.0) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(terminfo-0.4.1.5) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3)"

inherit rpm

SUMMARY = "Haskell Cabal profiling library"
DESCRIPTION = "This package provides the Haskell Cabal profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-prof-3.8.1.0-3.1.aarch64.rpm"
RPM_HASH = "99a686e744d1b69060a1fff7010612d242df517d00e4c1675fe359256bbe628aac174d961833179d24e8a73b57c29755503e320d1a83903bb292c64eebeee24b"

RPROVIDES:${PN} += "ghc-Cabal-prof \
ghc-Cabal-prof(aarch-64) \
ghc-prof(Cabal-3.8.1.0)"
RDEPENDS:${PN} += "ghc-Cabal-devel(aarch-64) \
ghc-prof(Cabal-syntax-3.8.1.0) \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(pretty-1.1.3.6) \
ghc-prof(process-1.6.16.0) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3)"

inherit rpm

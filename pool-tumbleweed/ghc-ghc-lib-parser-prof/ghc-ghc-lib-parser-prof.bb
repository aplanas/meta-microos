SUMMARY = "Haskell ghc-lib-parser profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5.20230430"

RPM_NAME = "ghc-ghc-lib-parser-prof-9.4.5.20230430-1.3.aarch64.rpm"
RPM_HASH = "7fa41d15a5631223fe1a38f6cf8db917633f4bd791bb6c0eb7c89c6977e9691b71cde696621c956257a50c4b27f66cb689da97e2b0d1798931a0945e380c61ba"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-prof \
ghc-prof-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm

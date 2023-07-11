SUMMARY = "Haskell ghc-lib-parser library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5.20230430"

RPM_NAME = "ghc-ghc-lib-parser-devel-9.4.5.20230430-1.3.aarch64.rpm"
RPM_HASH = "fef005a42cc2465e932cd0c980aff132080cd16f1097557ddf550761879d8e43e9563c90a3c9b193d24f736aa934b1d71bbd08427b2e597bcdf0cce1d8be96df"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M \
ghc-ghc-lib-parser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.16.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghc-lib-parser"

inherit rpm

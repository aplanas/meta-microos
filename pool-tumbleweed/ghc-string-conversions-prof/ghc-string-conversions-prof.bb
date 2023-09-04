SUMMARY = "Haskell string-conversions profiling library"
DESCRIPTION = "This package provides the Haskell string-conversions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-prof-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "34902d1dee4c706a2e21a4c7def163113d6f8be853c5a3739c8ba8cbebaad8aee9c7154ef36f453e3436b040dcbbe0af8070863c436c265bee94b40403badee2"

RPROVIDES:${PN} += "ghc-prof-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-string-conversions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-string-conversions-devel"

inherit rpm

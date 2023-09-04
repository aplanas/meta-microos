SUMMARY = "Haskell ShellCheck profiling library"
DESCRIPTION = "This package provides the Haskell ShellCheck profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-prof-0.9.0-2.11.aarch64.rpm"
RPM_HASH = "8d416266d68767073f8c957017ee0147118229747f7d1004722d6a01cd5b1d98a5653be340ab9ceb1417a0521cf64ad75def82188b065c672bb515a51701ad32"

RPROVIDES:${PN} += "ghc-ShellCheck-prof \
ghc-prof-ShellCheck-0.9.0-TBi9P689024G2PjJ0tZqq"

RDEPENDS:${PN} += "ghc-ShellCheck-devel \
ghc-prof-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg \
ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fgl-5.8.0.0-JXOHdIncLQ9K05kSZoGOKU \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-process-1.6.17.0 \
ghc-prof-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-prof-transformers-0.5.6.2"

inherit rpm

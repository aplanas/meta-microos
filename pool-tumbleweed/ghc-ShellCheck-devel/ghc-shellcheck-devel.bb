SUMMARY = "Haskell ShellCheck library development files"
DESCRIPTION = "This package provides the Haskell ShellCheck library development files."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-devel-0.9.0-2.11.aarch64.rpm"
RPM_HASH = "cd34a432d5beeeb3ae4146ba615897a82892a8203ca97e42ff0cc550c531af308eece15ab03a36a482677e371219b19c319f985ecec5de06e768a3d0b5ee71a9"

RPROVIDES:${PN} += "ghc-ShellCheck-devel \
ghc-devel-ShellCheck-0.9.0-TBi9P689024G2PjJ0tZqq"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ShellCheck \
ghc-compiler \
ghc-devel-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fgl-5.8.0.0-JXOHdIncLQ9K05kSZoGOKU \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-process-1.6.17.0 \
ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-devel-transformers-0.5.6.2"

inherit rpm

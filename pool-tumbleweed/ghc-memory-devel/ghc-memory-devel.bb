SUMMARY = "Haskell memory library development files"
DESCRIPTION = "This package provides the Haskell memory library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-devel-0.18.0-2.7.aarch64.rpm"
RPM_HASH = "6c6820473f7fad151d32cacf32a9cf6a7e9f968d5231a5a5487dea69a6a448317c0ebcbabd2a35d136559e16bd3599cb6b53f03e9a4e1284a78cc526d123f3b4"

RPROVIDES:${PN} += "ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-memory-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-memory"

inherit rpm

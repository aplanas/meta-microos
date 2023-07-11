SUMMARY = "Haskell memory profiling library"
DESCRIPTION = "This package provides the Haskell memory profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-prof-0.18.0-2.7.aarch64.rpm"
RPM_HASH = "3ae98a317cadd20cb353d8aa4bce9f63530aebd77bc6a26465ab4696c63e68b369af118881530f8c285ad45c33c7aa713b65383e67910d1db6f8a388508c47cf"

RPROVIDES:${PN} += "ghc-memory-prof \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp"

RDEPENDS:${PN} += "ghc-memory-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm

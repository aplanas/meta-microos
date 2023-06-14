SUMMARY = "Haskell microlens-ghc profiling library"
DESCRIPTION = "This package provides the Haskell microlens-ghc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-prof-0.4.14.1-2.2.aarch64.rpm"
RPM_HASH = "7d97aefa23789f13d087b1c203a4e1317958d150adc16afa967959d72ec0059b0d08f6f535ed62d8143fdd1b944064e5f2e249b0f8568e66c6b947ecafcff92c"

RPROVIDES:${PN} += "ghc-microlens-ghc-prof \
ghc-prof-microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB"

RDEPENDS:${PN} += "ghc-microlens-ghc-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-transformers-0.5.6.2"

inherit rpm

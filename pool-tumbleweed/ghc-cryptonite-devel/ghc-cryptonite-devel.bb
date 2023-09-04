SUMMARY = "Haskell cryptonite library development files"
DESCRIPTION = "This package provides the Haskell cryptonite library development files."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-devel-0.30-2.8.aarch64.rpm"
RPM_HASH = "044331792464344540d733c13e49287c52aea041c5f9b38e1a9bf5cb43e58da8a99865ff0e0ae723457efedfe01df77471f58fbf75fc311d780e1d0bf354210f"

RPROVIDES:${PN} += "ghc-cryptonite-devel \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-integer-gmp-1.1 \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
glibc-devel"

inherit rpm

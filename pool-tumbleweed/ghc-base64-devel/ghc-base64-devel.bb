SUMMARY = "Haskell base64 library development files"
DESCRIPTION = "This package provides the Haskell base64 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-devel-0.4.2.4-3.6.aarch64.rpm"
RPM_HASH = "6d6e63c51dc50268f9e519729d69985562fd589ccf709c1ed5fa2cc69d578a00a071f048ceaf05640ab57b8923f24eec847013ef7d8d90b978ec9bfc9c36ebc7"

RPROVIDES:${PN} += "ghc-base64-devel \
ghc-devel-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64 \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2"

inherit rpm

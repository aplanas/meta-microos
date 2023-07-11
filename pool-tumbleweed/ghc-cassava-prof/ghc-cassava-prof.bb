SUMMARY = "Haskell cassava profiling library"
DESCRIPTION = "This package provides the Haskell cassava profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-prof-0.5.3.0-2.6.aarch64.rpm"
RPM_HASH = "a3c8f4392fcca08d26814de920cbaa37a94568e8d0954e457b1e36670fc1ba3686cd66ab13fce650217408b513bee3392bb2ff87ed355e1711671a95795d0230"

RPROVIDES:${PN} += "ghc-cassava-prof \
ghc-prof-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD"

RDEPENDS:${PN} += "ghc-cassava-devel \
ghc-prof-Only-0.1-ETd5YCT0TwGLbN8rgpgTS8 \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm

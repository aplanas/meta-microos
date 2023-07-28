SUMMARY = "Haskell cassava profiling library"
DESCRIPTION = "This package provides the Haskell cassava profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-prof-0.5.3.0-3.1.aarch64.rpm"
RPM_HASH = "4a26d4b073e5112275b96948bfdaedbcce4ea007f4525c424623cb296349475aee7e94d121088a9952eefa68b1224e98eafa33d4f95e6eef4eb800125794b088"

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

SUMMARY = "Haskell hashtables library development files"
DESCRIPTION = "This package provides the Haskell hashtables library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "f77210811b64d486bec5aa5fccda38cd6ff139102586096f26680cf21245ec9f6463df9b2e7a6391a4f4821dd4a750d428cca3cc7faba11ae70e0fed8014ff62"

RPROVIDES:${PN} += "ghc-devel(hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p) \
ghc-hashtables-devel \
ghc-hashtables-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-hashtables"

inherit rpm

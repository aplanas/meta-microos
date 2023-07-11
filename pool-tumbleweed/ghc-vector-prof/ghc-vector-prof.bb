SUMMARY = "Haskell vector profiling library"
DESCRIPTION = "This package provides the Haskell vector profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-prof-0.13.0.0-1.6.aarch64.rpm"
RPM_HASH = "7c9f537607ace29e9316522ace8db276dd287ea39ff6031a40c6fa98d70be73923f9ecf4c5c7c99030e039ac11577265ec261996488ca689778cedc5526bf070"

RPROVIDES:${PN} += "ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s \
ghc-vector-devel"

inherit rpm

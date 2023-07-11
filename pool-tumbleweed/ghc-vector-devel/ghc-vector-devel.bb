SUMMARY = "Haskell vector library development files"
DESCRIPTION = "This package provides the Haskell vector library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-devel-0.13.0.0-1.6.aarch64.rpm"
RPM_HASH = "9c3a134fde84a76df6ebaf94803251a8480b603261d9b60c7efdecca569390d42fb7372042143f8da5092c1c3060e74ffe8c85c0dd5483d90ec7c2812876d3fb"

RPROVIDES:${PN} += "ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s \
ghc-vector"

inherit rpm

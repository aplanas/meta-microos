SUMMARY = "Haskell streaming-commons library development files"
DESCRIPTION = "This package provides the Haskell streaming-commons library development \
files."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-devel-0.2.2.6-1.3.aarch64.rpm"
RPM_HASH = "9900d1dfb04c1f97922f771b1a82235eda142b78e3cd54018a1fce5e94eaf333995ea7118d39807d605aa1b017a7f64135b7c48af7952eaced4925f0f2c20bb1"

RPROVIDES:${PN} += "ghc-devel-streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G \
ghc-streaming-commons-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-process-1.6.16.0 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-stm-2.5.1.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-streaming-commons"

inherit rpm

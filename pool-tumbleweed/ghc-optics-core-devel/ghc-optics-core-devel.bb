SUMMARY = "Haskell optics-core library development files"
DESCRIPTION = "This package provides the Haskell optics-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-optics-core-devel-0.4.1-2.3.aarch64.rpm"
RPM_HASH = "5b7928bf317d539fed2e55a7beeae2d0b38df632f1335fbf7e6a02ecf4d136a834df5ebf376caf3eab5281c06ec778fc240b7546ad83060b298aaa70741b1b2d"

RPROVIDES:${PN} += "ghc-devel(optics-core-0.4.1-Awni0JkjGzeFZo6HXDNwcT) \
ghc-optics-core-devel \
ghc-optics-core-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(indexed-profunctors-0.1.1-8slbuH4IUUg1HsCF6rf8GV) \
ghc-devel(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) \
ghc-devel(transformers-0.5.6.2) \
ghc-optics-core"

inherit rpm

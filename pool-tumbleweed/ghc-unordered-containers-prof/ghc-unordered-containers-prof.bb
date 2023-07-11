SUMMARY = "Haskell unordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell unordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-prof-0.2.19.1-3.6.aarch64.rpm"
RPM_HASH = "db7fee25aa133f2e2b223c1c2dade29df0e685dcad31588e2f2265d4e6ecf4160dca13bc5d2a00f971eeb4fde1bac6ec3b5943d5fe5c174e70686115ff2c207a"

RPROVIDES:${PN} += "ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-unordered-containers-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-template-haskell-2.19.0.0 \
ghc-unordered-containers-devel"

inherit rpm

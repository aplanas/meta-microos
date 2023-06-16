SUMMARY = "Haskell unordered-containers library development files"
DESCRIPTION = "This package provides the Haskell unordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-devel-0.2.19.1-3.3.aarch64.rpm"
RPM_HASH = "4149c8c8ecf6ea37e078b045933b33b580525ef831c4e8d562a2b9318bc1421248a0a90e2f33dc8d86461c69494a4b88839d1e2e0090cbe8ed3377cede1efdcf"

RPROVIDES:${PN} += "ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-unordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-template-haskell-2.19.0.0 \
ghc-unordered-containers"

inherit rpm

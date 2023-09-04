SUMMARY = "Haskell language-javascript library development files"
DESCRIPTION = "This package provides the Haskell language-javascript library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-devel-0.7.1.0-4.8.aarch64.rpm"
RPM_HASH = "b36e4628a6d6977d690295540178b54b4532f0bdbee20d9698a83cb63f1b4050f3624523e669d410898a03091a275220010a05390840126864a1c07be76fa1d1"

RPROVIDES:${PN} += "ghc-devel-language-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg \
ghc-language-javascript-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-language-javascript"

inherit rpm

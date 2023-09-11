SUMMARY = "Haskell language-javascript library development files"
DESCRIPTION = "This package provides the Haskell language-javascript library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-devel-0.7.1.0-4.9.aarch64.rpm"
RPM_HASH = "db36aeef8749eaaa4fa71f37135b317b33b716024b8d582bb6201910c62147c8959bd4b3fdafbee7bde06a215d77317ffe1aaef2bb2bd3c8d96975b7c5a99137"

RPROVIDES:${PN} += "ghc-devel-language-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4 \
ghc-language-javascript-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-language-javascript"

inherit rpm

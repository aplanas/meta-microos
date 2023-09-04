SUMMARY = "Haskell xss-sanitize library development files"
DESCRIPTION = "This package provides the Haskell xss-sanitize library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-devel-0.3.7.2-1.9.aarch64.rpm"
RPM_HASH = "b1165c816cfa4708049d1127f6e9cd49c65ae85884820a04dcc3465eb4b8b700c5f5c05221cdcdf948bcf452acfb7a8ab6eb29be1b4431a4982fd0c8ce09d1f2"

RPROVIDES:${PN} += "ghc-devel-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-xss-sanitize-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-xss-sanitize"

inherit rpm

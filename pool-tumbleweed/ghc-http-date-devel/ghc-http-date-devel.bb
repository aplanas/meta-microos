SUMMARY = "Haskell http-date library development files"
DESCRIPTION = "This package provides the Haskell http-date library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-devel-0.0.11-2.9.aarch64.rpm"
RPM_HASH = "71498e140cab58ad1d155784a36bda5fc6d66c432570a97086902b8c0b39edc9ea2e27d15912f1634ad7c91118a999999bb5b73f7b6c0a0b5a8cbb845748fe09"

RPROVIDES:${PN} += "ghc-devel-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv \
ghc-http-date-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-time-1.12.2 \
ghc-http-date"

inherit rpm

SUMMARY = "Haskell sop-core library development files"
DESCRIPTION = "This package provides the Haskell sop-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-devel-0.5.0.2-4.3.aarch64.rpm"
RPM_HASH = "9b84a5a69e0a808b68856996004ba88d28a9996b290427214c5d9cf780b6c05f1dc590130b8f3e2a01dd217b3013b2ffdbed1f681221fd6af0a299c382212933"

RPROVIDES:${PN} += "ghc-devel-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-sop-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-sop-core"

inherit rpm

SUMMARY = "Haskell unicode-transforms library development files"
DESCRIPTION = "This package provides the Haskell unicode-transforms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-devel-0.4.0.1-4.3.aarch64.rpm"
RPM_HASH = "11c5819083528087b56e55d742438d668d80248e09b9d4b2b027e4cd09add4d2e99bde3209042909b6ef9fe81deb1f7d9d9112a6996139dd2c1cc4a7ed387e6d"

RPROVIDES:${PN} += "ghc-devel-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO \
ghc-unicode-transforms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-transforms"

inherit rpm

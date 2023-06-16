SUMMARY = "Haskell th-compat library development files"
DESCRIPTION = "This package provides the Haskell th-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-devel-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "29dc19a71407187d4855a5a3e3a18ca866daad08e2dcbbedd48e1ccfce6044a8f7c471f7a86e35edfa8266a9b54be23b4e4d71897d4ce12496b85bfe4b685edb"

RPROVIDES:${PN} += "ghc-devel-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv \
ghc-th-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-th-compat"

inherit rpm

SUMMARY = "Haskell doctemplates library development files"
DESCRIPTION = "This package provides the Haskell doctemplates library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-devel-0.11-1.3.aarch64.rpm"
RPM_HASH = "532f8023f0605b04680bd1f267079b44444d1c071745e87502b276f8f7a9bbaf5fb6413458031b33fbb6ebd4254b5f7fe076398b371a2388c2cc8442d5cff9fd"

RPROVIDES:${PN} += "ghc-devel-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-doctemplates-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-doctemplates"

inherit rpm

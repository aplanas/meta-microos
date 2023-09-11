SUMMARY = "Haskell timerep library development files"
DESCRIPTION = "This package provides the Haskell timerep library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-devel-2.1.0.0-1.12.aarch64.rpm"
RPM_HASH = "6209019c6fb6df8963cd894453a2b49d941a397dc362f9c7ca87734af2872b0790542dc63dc625fa60057748d74e8d5870c88b3d03f1097c591df90b064c1bdd"

RPROVIDES:${PN} += "ghc-devel-timerep-2.1.0.0-IaSai5sQyvSEzoXHpabvZQ \
ghc-timerep-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-monoid-subclasses-1.2.4-19X6M9mjCjC7gPD9QVvKTU \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-timerep"

inherit rpm

SUMMARY = "Haskell timerep profiling library"
DESCRIPTION = "This package provides the Haskell timerep profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-prof-2.1.0.0-1.12.aarch64.rpm"
RPM_HASH = "53bd74d04a6eb5719e55f23c59f7e75ec11aba950dab991473dca15c3f92f0b6adcb7c296783500e2d41c8f22bbf36d850b89e099cd4db605c56f3d296e66c93"

RPROVIDES:${PN} += "ghc-prof-timerep-2.1.0.0-IaSai5sQyvSEzoXHpabvZQ \
ghc-timerep-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-monoid-subclasses-1.2.4-19X6M9mjCjC7gPD9QVvKTU \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-timerep-devel"

inherit rpm

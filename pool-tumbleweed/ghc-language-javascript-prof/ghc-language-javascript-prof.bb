SUMMARY = "Haskell language-javascript profiling library"
DESCRIPTION = "This package provides the Haskell language-javascript profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-prof-0.7.1.0-4.8.aarch64.rpm"
RPM_HASH = "dee48bd81a680c834e788e3e5aa3af0f7cf3db776fc8d858474e81db5663c20bf396cd1b4019beb0e799cda84662fb11b560467fae8d5e55d4036784fdec939a"

RPROVIDES:${PN} += "ghc-language-javascript-prof \
ghc-prof-language-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg"

RDEPENDS:${PN} += "ghc-language-javascript-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm

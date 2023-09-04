SUMMARY = "Haskell unliftio-core profiling library"
DESCRIPTION = "This package provides the Haskell unliftio-core profiling library."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-prof-0.2.1.0-1.8.aarch64.rpm"
RPM_HASH = "bfb1f85bc5116bfa27f76cc1f2af917bd8ef9be3bb81b09f1d866e03c0cd9fc251ee8089d1464b072344f66b44e99d41d0a28e5220fb84e87797bf86181f4456"

RPROVIDES:${PN} += "ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-unliftio-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-unliftio-core-devel"

inherit rpm

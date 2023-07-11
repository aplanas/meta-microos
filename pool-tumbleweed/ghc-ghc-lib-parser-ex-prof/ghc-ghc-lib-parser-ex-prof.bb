SUMMARY = "Haskell ghc-lib-parser-ex profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-prof-9.4.0.0-1.6.aarch64.rpm"
RPM_HASH = "c29a923ae8180cd399ef8266764fb0a824592daccb3dc4b8efe0e7c1efa8076a7e3ee4300b972d066d55213ecfb7d288bd2d24d3efba433c3e85b6a2f6632fda"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-prof \
ghc-prof-ghc-lib-parser-ex-9.4.0.0-csIofWAAh3CX4OvchqGS5"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-ex-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M \
ghc-prof-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN"

inherit rpm

SUMMARY = "Haskell ghc-lib-parser-ex profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-prof-9.4.0.0-1.12.aarch64.rpm"
RPM_HASH = "0b21a4c9a822f040730b2c005c669474bdde6c899a02455cda78548487e384f0a1adf1c0dc1cc5c6c07aa218ff7e58de2896521ca461482809aca1dc2ec65c1b"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-prof \
ghc-prof-ghc-lib-parser-ex-9.4.0.0-5gI0mYE7T3L4MUgurM5BvD"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-ex-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU \
ghc-prof-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX"

inherit rpm

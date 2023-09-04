SUMMARY = "Haskell email-validate profiling library"
DESCRIPTION = "This package provides the Haskell email-validate profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.19"

RPM_NAME = "ghc-email-validate-prof-2.3.2.19-1.3.aarch64.rpm"
RPM_HASH = "409fb608fcb23a556ead9c8ffb0c73a901673c24fe3e7699d90534d92e96cebfcd6d9f63d1f394e30bbceb436a6b31b61d6a6a00619ea77a10773d90f9ac447c"

RPROVIDES:${PN} += "ghc-email-validate-prof \
ghc-prof-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN"

RDEPENDS:${PN} += "ghc-email-validate-devel \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm

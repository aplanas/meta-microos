SUMMARY = "Haskell crypto-api profiling library"
DESCRIPTION = "This package provides the Haskell crypto-api profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-prof-0.13.3-5.9.aarch64.rpm"
RPM_HASH = "3c96f7841e2c853986d5f12f280991022abac4a1e6878afa9b3a3e85ca5f7d04bcff97c79cecec56dd5160201823c97eaa3ed3c92feabeb55ae53b2c8aa5f8f8"

RPROVIDES:${PN} += "ghc-crypto-api-prof \
ghc-prof-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z"

RDEPENDS:${PN} += "ghc-crypto-api-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2"

inherit rpm

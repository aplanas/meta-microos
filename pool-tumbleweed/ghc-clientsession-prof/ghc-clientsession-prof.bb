SUMMARY = "Haskell clientsession profiling library"
DESCRIPTION = "This package provides the Haskell clientsession profiling library."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-prof-0.9.2.0-2.4.aarch64.rpm"
RPM_HASH = "f41148fe8732ab159e923753fb687b806fcffb57733e2cffd5c35796a35646a0669508e1a63cfec5dd98543efd110c0e9467f799543141b5f6b29535797ad458"

RPROVIDES:${PN} += "ghc-clientsession-prof \
ghc-prof-clientsession-0.9.2.0-KWpEVRfIrcVFYLxAWzOYnt"

RDEPENDS:${PN} += "ghc-clientsession-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-directory-1.3.7.1 \
ghc-prof-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-prof-setenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7 \
ghc-prof-skein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax"

inherit rpm

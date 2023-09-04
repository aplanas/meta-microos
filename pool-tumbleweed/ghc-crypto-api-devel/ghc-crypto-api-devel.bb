SUMMARY = "Haskell crypto-api library development files"
DESCRIPTION = "This package provides the Haskell crypto-api library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-devel-0.13.3-5.9.aarch64.rpm"
RPM_HASH = "db48fe6d70ae272b85acecd73bb5ff143c05d1a6358ce4665960d7d56c4d09c4144226e2d6e8b9df69660b3e1b8bede7e7c582b2f8209bd8ac69866b9b227d26"

RPROVIDES:${PN} += "ghc-crypto-api-devel \
ghc-devel-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-api \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2"

inherit rpm

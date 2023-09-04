SUMMARY = "Haskell clientsession library development files"
DESCRIPTION = "This package provides the Haskell clientsession library development files."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-devel-0.9.2.0-2.4.aarch64.rpm"
RPM_HASH = "1ba52ab76ce4f315fcc8ff765269b15e26c58e0efe3302f0655114ef8a16b5b8fe619351973b96178387dc8a1c06c4ee47121a3a8db2f7e490ca8cabc66c8e66"

RPROVIDES:${PN} += "ghc-clientsession-devel \
ghc-devel-clientsession-0.9.2.0-KWpEVRfIrcVFYLxAWzOYnt"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clientsession \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-directory-1.3.7.1 \
ghc-devel-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-devel-setenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7 \
ghc-devel-skein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax"

inherit rpm

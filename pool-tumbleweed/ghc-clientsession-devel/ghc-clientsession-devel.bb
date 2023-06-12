SUMMARY = "Haskell clientsession library development files"
DESCRIPTION = "This package provides the Haskell clientsession library development files."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-devel-0.9.1.2-4.3.aarch64.rpm"
RPM_HASH = "e8382c10174b52216c163ef7943faebaaa8e6a4a72df422cbf5b2cea4e99b478fcee1aff25550b7cd5c13bae81499e7e871c7e912b736cd85eed372f31c1f7af"

RPROVIDES:${PN} += "ghc-clientsession-devel \
ghc-clientsession-devel(aarch-64) \
ghc-devel(clientsession-0.9.1.2-Jnvj5vMN6iR9xGMf6HxcGE)"
RDEPENDS:${PN} += "/bin/sh \
ghc-clientsession \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi) \
ghc-devel(cprng-aes-0.6.1-169qys47NiB5UR1VcEjGCA) \
ghc-devel(crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE) \
ghc-devel(crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-devel(setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x) \
ghc-devel(skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa)"

inherit rpm

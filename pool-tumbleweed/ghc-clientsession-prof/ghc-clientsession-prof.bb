SUMMARY = "Haskell clientsession profiling library"
DESCRIPTION = "This package provides the Haskell clientsession profiling library."
LICENSE = "MIT"

PV = "0.9.1.2"

RPM_NAME = "ghc-clientsession-prof-0.9.1.2-4.3.aarch64.rpm"
RPM_HASH = "cd791bb344759f47a8e35d71d9f6d2e449765f5062b61a6b3f274429fec4f9f451274277aa902c8f692e6250d64b6328c5e75bab4de5a4570ef62fd123fa7e28"

RPROVIDES:${PN} += "ghc-clientsession-prof \
ghc-clientsession-prof(aarch-64) \
ghc-prof(clientsession-0.9.1.2-Jnvj5vMN6iR9xGMf6HxcGE)"

RDEPENDS:${PN} += "ghc-clientsession-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-prof(cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi) \
ghc-prof(cprng-aes-0.6.1-169qys47NiB5UR1VcEjGCA) \
ghc-prof(crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE) \
ghc-prof(crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-prof(setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x) \
ghc-prof(skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa)"

inherit rpm

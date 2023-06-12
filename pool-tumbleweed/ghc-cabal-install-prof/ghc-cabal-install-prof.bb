SUMMARY = "Haskell cabal-install profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-prof-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "97d34d64e82bcc56221421b63ea7443ca3414f8c1e96d9ad9a594355533acda28518dbb242d6310375c4d8efd5d22aec473a62d374c3b68f3e72c01d785430bc"

RPROVIDES:${PN} += "ghc-cabal-install-prof \
ghc-cabal-install-prof(aarch-64) \
ghc-prof(cabal-install-3.8.1.0-5UcdOch820LBdlzybhXr39)"
RDEPENDS:${PN} += "ghc-cabal-install-devel \
ghc-prof(Cabal-3.8.1.0) \
ghc-prof(Cabal-syntax-3.8.1.0) \
ghc-prof(HTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3) \
ghc-prof(array-0.5.4.0) \
ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp) \
ghc-prof(containers-0.6.7) \
ghc-prof(cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(echo-0.1.4-GGh6ZLKme4z6jywDiYhFOL) \
ghc-prof(edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(hackage-security-0.6.2.3-Km2R5J8alEh3bTkVIJr5Mq) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V) \
ghc-prof(mtl-2.2.2) \
ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(pretty-1.1.3.6) \
ghc-prof(process-1.6.16.0) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-prof(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-prof(regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1) \
ghc-prof(resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr) \
ghc-prof(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) \
ghc-prof(stm-2.5.1.0) \
ghc-prof(tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(unix-2.7.3) \
ghc-prof(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk)"

inherit rpm
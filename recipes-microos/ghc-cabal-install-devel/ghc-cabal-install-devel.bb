SUMMARY = "Haskell cabal-install library development files"
DESCRIPTION = "This package provides the Haskell cabal-install library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-devel-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "1c55915cb565c77f16d1768d039ece03f7c2e1dd28098f696263251ec43ee342a95d77ca91fdca2da9f384a66492daa5064b91cc86282fc1db2de82e710be281"

RPROVIDES:${PN} += "ghc-cabal-install-devel ghc-cabal-install-devel(aarch-64) ghc-devel(cabal-install-3.8.1.0-5UcdOch820LBdlzybhXr39)"
RDEPENDS:${PN} += "/bin/sh ghc-cabal-install ghc-compiler ghc-devel(Cabal-3.8.1.0) ghc-devel(Cabal-syntax-3.8.1.0) ghc-devel(HTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3) ghc-devel(array-0.5.4.0) ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) ghc-devel(base-4.17.1.0) ghc-devel(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(cabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp) ghc-devel(containers-0.6.7) ghc-devel(cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD) ghc-devel(directory-1.3.7.1) ghc-devel(echo-0.1.4-GGh6ZLKme4z6jywDiYhFOL) ghc-devel(edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu) ghc-devel(exceptions-0.10.5) ghc-devel(filepath-1.4.2.2) ghc-devel(hackage-security-0.6.2.3-Km2R5J8alEh3bTkVIJr5Mq) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V) ghc-devel(mtl-2.2.2) ghc-devel(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) ghc-devel(parsec-3.1.16.1) ghc-devel(pretty-1.1.3.6) ghc-devel(process-1.6.16.0) ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-devel(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) ghc-devel(regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1) ghc-devel(resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr) ghc-devel(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) ghc-devel(stm-2.5.1.0) ghc-devel(tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8) ghc-devel(text-2.0.2) ghc-devel(time-1.12.2) ghc-devel(unix-2.7.3) ghc-devel(zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk)"

inherit rpm

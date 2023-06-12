SUMMARY = "Haskell cabal-install library"
DESCRIPTION = "This package provides the Haskell cabal-install shared library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "40afc057434351f4189aae222fe508c624afa389d5c01dd6131cc4bcacca7075126f6d935a85273c10b147cbc4c71afc40dd384464717da23a5e3537bcb2c802"

RPROVIDES:${PN} += "ghc-cabal-install \
ghc-cabal-install(aarch-64) \
libHScabal-install-3.8.1.0-5UcdOch820LBdlzybhXr39-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.5.so()(64bit) \
libHSCabal-syntax-3.8.1.0-ghc9.4.5.so()(64bit) \
libHSHTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so()(64bit) \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSecho-0.1.4-GGh6ZLKme4z6jywDiYhFOL-ghc9.4.5.so()(64bit) \
libHSed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8-ghc9.4.5.so()(64bit) \
libHSedit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShackage-security-0.6.2.3-Km2R5J8alEh3bTkVIJr5Mq-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSlukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) \
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so()(64bit) \
libHSregex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1-ghc9.4.5.so()(64bit) \
libHSresolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr-ghc9.4.5.so()(64bit) \
libHSsafe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD-ghc9.4.5.so()(64bit) \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm

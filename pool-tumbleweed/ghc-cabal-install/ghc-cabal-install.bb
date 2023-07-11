SUMMARY = "Haskell cabal-install library"
DESCRIPTION = "This package provides the Haskell cabal-install shared library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-3.8.1.0-1.7.aarch64.rpm"
RPM_HASH = "2e1cb65b8ba5aa7540fdb34c4a6912f40b42aae9360555b43e10083ea9005c91253f4fa72c4dae0d3ea8f5457b53860fd49105e514cc065cbf70ce95d40a3da0"

RPROVIDES:${PN} += "ghc-cabal-install \
libHScabal-install-3.8.1.0-EqoYmuno0LiJ3JWLtQXleA-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.5.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.5.so \
libHSHTTP-4000.4.1-7No2v5wGQP7LivFOppGzbz-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSecho-0.1.4-GGh6ZLKme4z6jywDiYhFOL-ghc9.4.5.so \
libHSed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8-ghc9.4.5.so \
libHSedit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShackage-security-0.6.2.3-BVLL0begiUMDlGngVjOMXt-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSlukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so \
libHSregex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1-ghc9.4.5.so \
libHSresolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr-ghc9.4.5.so \
libHSsafe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm

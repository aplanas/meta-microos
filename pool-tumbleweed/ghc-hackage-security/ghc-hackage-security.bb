SUMMARY = "Hackage security library"
DESCRIPTION = "The hackage security library provides both server and client utilities for \
securing the Hackage package server (<https://hackage.haskell.org/>). \
It is based on The Update Framework (<https://theupdateframework.com/>), a set \
of recommendations developed by security researchers at various universities in \
the US as well as developers on the Tor project \
(<https://www.torproject.org/>). \
 \
The current implementation supports only index signing, thereby enabling \
untrusted mirrors. It does not yet provide facilities for author package \
signing. \
 \
The library has two main entry points: 'Hackage.Security.Client' is the main \
entry point for clients (the typical example being 'cabal'), and \
'Hackage.Security.Server' is the main entry point for servers (the typical \
example being 'hackage-server')."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-0.6.2.3-1.3.aarch64.rpm"
RPM_HASH = "227b7498abbc5ece187a0a643780f454dfc59cf09cd06208f2a85779517808b9da9de72419bf4e2529c9babff71e7ac179e289932fa70499d440a1fdbf5378f7"

RPROVIDES:${PN} += "ghc-hackage-security \
libHShackage-security-0.6.2.3-Km2R5J8alEh3bTkVIJr5Mq-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSCabal-syntax-3.8.1.0-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSlukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
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

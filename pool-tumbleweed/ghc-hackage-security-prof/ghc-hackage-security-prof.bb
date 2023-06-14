SUMMARY = "Haskell hackage-security profiling library"
DESCRIPTION = "This package provides the Haskell hackage-security profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-prof-0.6.2.3-1.3.aarch64.rpm"
RPM_HASH = "dd17d2dcdd20549326204fd8ee6ea15b5ec5352b6633af948600e1088714bc1d75435c9176009573c0786ac19599c3da6b686ad9a3a8383af419d7f7516ade61"

RPROVIDES:${PN} += "ghc-hackage-security-prof \
ghc-prof-hackage-security-0.6.2.3-Km2R5J8alEh3bTkVIJr5Mq"

RDEPENDS:${PN} += "ghc-hackage-security-devel \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD \
ghc-prof-directory-1.3.7.1 \
ghc-prof-ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk"

inherit rpm

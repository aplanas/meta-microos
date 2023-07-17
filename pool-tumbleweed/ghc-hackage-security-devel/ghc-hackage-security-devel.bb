SUMMARY = "Haskell hackage-security library development files"
DESCRIPTION = "This package provides the Haskell hackage-security library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-devel-0.6.2.3-2.1.aarch64.rpm"
RPM_HASH = "73d5937690503ce020011f27641c221ab2a852361059a65ba1282b4e353db0651ffab88fdc100e196ab3daed11b8cf2b671ef422111a97460fb9ca179065e807"

RPROVIDES:${PN} += "ghc-devel-hackage-security-0.6.2.3-BVLL0begiUMDlGngVjOMXt \
ghc-hackage-security-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD \
ghc-devel-directory-1.3.7.1 \
ghc-devel-ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-hackage-security"

inherit rpm

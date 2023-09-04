SUMMARY = "Haskell hackage-security profiling library"
DESCRIPTION = "This package provides the Haskell hackage-security profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-prof-0.6.2.3-3.3.aarch64.rpm"
RPM_HASH = "60c8074f24cb91eac267c621136bd0d2096a847083dea8d6778dffca5426e1d3073b1fcd69d24b6afb520b8022490e999e09d5471e89310fb9209c14e1378175"

RPROVIDES:${PN} += "ghc-hackage-security-prof \
ghc-prof-hackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD"

RDEPENDS:${PN} += "ghc-hackage-security-devel \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr \
ghc-prof-directory-1.3.7.1 \
ghc-prof-ed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm

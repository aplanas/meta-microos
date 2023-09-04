SUMMARY = "Haskell hackage-security library development files"
DESCRIPTION = "This package provides the Haskell hackage-security library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-devel-0.6.2.3-3.3.aarch64.rpm"
RPM_HASH = "690c03a5cdcfcd386bcd5fe102184feb1ad376a64f4fc3f8a4939d56ab11063dee259f6f2a5daebca5cfe79ae0aef778ed07994d6bd704f4fa0f7992279a6c05"

RPROVIDES:${PN} += "ghc-devel-hackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD \
ghc-hackage-security-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr \
ghc-devel-directory-1.3.7.1 \
ghc-devel-ed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-hackage-security"

inherit rpm

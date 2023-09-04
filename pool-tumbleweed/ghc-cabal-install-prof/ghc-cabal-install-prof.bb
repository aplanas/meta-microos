SUMMARY = "Haskell cabal-install profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-prof-3.8.1.0-2.4.aarch64.rpm"
RPM_HASH = "86fb8623b7c500fa8bb98bca774e04e2b19853ad3aba656c5ad58eb2999d762ed539462240955df110144aa30a8b92d62773f74ae007c3b5a5604b8e3b845948"

RPROVIDES:${PN} += "ghc-cabal-install-prof \
ghc-prof-cabal-install-3.8.1.0-1PXctuiVIYtG8edF5gKkQf"

RDEPENDS:${PN} += "ghc-cabal-install-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-Cabal-syntax-3.8.1.0 \
ghc-prof-HTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cabal-install-solver-3.8.1.0-HqlMIPzmCO3CZ7Pg6YZtFo \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr \
ghc-prof-directory-1.3.7.1 \
ghc-prof-echo-0.1.4-E70uPOVrrAEEin21p1eUkX \
ghc-prof-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-prof-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-prof-resolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl \
ghc-prof-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-prof-stm-2.5.1.0 \
ghc-prof-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm

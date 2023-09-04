SUMMARY = "Haskell cabal-install library development files"
DESCRIPTION = "This package provides the Haskell cabal-install library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-devel-3.8.1.0-2.4.aarch64.rpm"
RPM_HASH = "e24f5bb4f9562afa81b07a4a04ba661974528b37a92a4e6e7e62753cdcf03e31f4e2f74ed3a9aba4c29940f652252ba53a9d2d2ac6b997e846bfc87d42ba2df0"

RPROVIDES:${PN} += "ghc-cabal-install-devel \
ghc-devel-cabal-install-3.8.1.0-1PXctuiVIYtG8edF5gKkQf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-install \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-Cabal-syntax-3.8.1.0 \
ghc-devel-HTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cabal-install-solver-3.8.1.0-HqlMIPzmCO3CZ7Pg6YZtFo \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr \
ghc-devel-directory-1.3.7.1 \
ghc-devel-echo-0.1.4-E70uPOVrrAEEin21p1eUkX \
ghc-devel-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-regex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae \
ghc-devel-regex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7 \
ghc-devel-resolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl \
ghc-devel-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm

SUMMARY = "Haskell cabal-install library"
DESCRIPTION = "This package provides the Haskell cabal-install shared library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-3.8.1.0-2.4.aarch64.rpm"
RPM_HASH = "f9418595cb09c4753f97e51f683be602c8fad94d152f2de20f615912139ee44de4aa83919621e5fecf6f922c48acf96eea7c22172a6a4717c145d993ab747c21"

RPROVIDES:${PN} += "ghc-cabal-install \
libHScabal-install-3.8.1.0-1PXctuiVIYtG8edF5gKkQf-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.6.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.6.so \
libHSHTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScabal-install-solver-3.8.1.0-HqlMIPzmCO3CZ7Pg6YZtFo-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSecho-0.1.4-E70uPOVrrAEEin21p1eUkX-ghc9.4.6.so \
libHSed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0-ghc9.4.6.so \
libHSedit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSlukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSregex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae-ghc9.4.6.so \
libHSregex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7-ghc9.4.6.so \
libHSresolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl-ghc9.4.6.so \
libHSsafe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm

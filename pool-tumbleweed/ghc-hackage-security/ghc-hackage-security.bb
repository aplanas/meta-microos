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

RPM_NAME = "ghc-hackage-security-0.6.2.3-3.3.aarch64.rpm"
RPM_HASH = "248f2b16fb3fb62025894e8eddd2dc9786956f0ba017832b31846f4a1cf8ea2d18bdc9969564ef2ecee2164e1879676a1fbe26ea6c620ea4990727ca1fd1918a"

RPROVIDES:${PN} += "ghc-hackage-security \
libHShackage-security-0.6.2.3-HSIGhImAxhKImz0PYWL2QD-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSCabal-syntax-3.8.1.0-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScryptohash-sha256-0.11.102.1-53jMaIynRosaQ7D7Mdzyr-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSlukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
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

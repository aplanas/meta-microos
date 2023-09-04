SUMMARY = "Haskell cryptohash-md5 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-devel-0.11.101.0-4.8.aarch64.rpm"
RPM_HASH = "f948529ba7554b4e33f81c0e41971adb6e798b3dcdfeb1894874c12553564a3ee4269517116730fb6102329df55885863f7ad23f59b408f7bea46b6df445af4f"

RPROVIDES:${PN} += "ghc-cryptohash-md5-devel \
ghc-devel-cryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-md5 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm

SUMMARY = "Haskell crypto-random library development files"
DESCRIPTION = "This package provides the Haskell crypto-random library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-devel-0.0.9-6.3.aarch64.rpm"
RPM_HASH = "9369d530098294c4fc7b748984c3036155bcadc09c13a6a84199813bd29a627fca519a048bd94e0de6c499288361f7621f3227353a3564b597467762de9ce9a5"

RPROVIDES:${PN} += "ghc-crypto-random-devel \
ghc-devel-crypto-random-0.0.9-EARwXMpyWawUPhdi0weks"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-random \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4 \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm

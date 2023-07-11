SUMMARY = "Haskell libiserv library development files"
DESCRIPTION = "This package provides the Haskell libiserv library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "0749a9260e0e822b75d5f20bbb541b859c4494081e4531b16999a4a483f7b9ece41a2db741521e2a0e81d4d9db2f92fc8745451e3d403e6974538b375d0cce5e"

RPROVIDES:${PN} += "ghc-devel-libiserv-9.4.5 \
ghc-libiserv-devel \
ghc-libiserv-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghci-9.4.5 \
ghc-devel-unix-2.7.3 \
ghc-libiserv"

inherit rpm

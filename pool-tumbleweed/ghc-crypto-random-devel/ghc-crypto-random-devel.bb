SUMMARY = "Haskell crypto-random library development files"
DESCRIPTION = "This package provides the Haskell crypto-random library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-devel-0.0.9-6.1.aarch64.rpm"
RPM_HASH = "72f561049cfc0241cb81800265e4905859f84934d99e516a6959410a216da644b4781dc2b3176ab683afab3f02438c51c430f3d457455a620682bfefdcd31c4b"

RPROVIDES:${PN} += "ghc-crypto-random-devel \
ghc-devel-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-random \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm

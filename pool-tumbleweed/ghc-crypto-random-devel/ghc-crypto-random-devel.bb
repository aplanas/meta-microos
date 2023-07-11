SUMMARY = "Haskell crypto-random library development files"
DESCRIPTION = "This package provides the Haskell crypto-random library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-devel-0.0.9-5.6.aarch64.rpm"
RPM_HASH = "d9a9e24cf93d744c874f5a4f2b9807c3e9d010e232e967b1882f3ecf40025919c3f8e36f5a6afc97a4290016a66022b076f47b54d19c4487e03a057c9eeab2a9"

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

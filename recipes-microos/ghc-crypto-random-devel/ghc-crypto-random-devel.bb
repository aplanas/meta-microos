SUMMARY = "Haskell crypto-random library development files"
DESCRIPTION = "This package provides the Haskell crypto-random library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-devel-0.0.9-5.3.aarch64.rpm"
RPM_HASH = "091478b87d2e5d0c5f0bb381bab1b8cdd9237f108b840f2bcce9687d741c621abe7d22cbe8dfe346ca3fe2354db38bdd1825c62378a33ceba584d9cf3574cb5f"

RPROVIDES:${PN} += "ghc-crypto-random-devel \
ghc-crypto-random-devel(aarch-64) \
ghc-devel(crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-crypto-random \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ) \
ghc-devel(unix-2.7.3) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm

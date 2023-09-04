SUMMARY = "Basic mime-type handling types and functions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/mime-types>."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-0.1.1.0-2.3.aarch64.rpm"
RPM_HASH = "1491ba0ee88b6d2c5abe7993bde61b02cfd20417eef1a99b232a19bbc7d2ec5b07d40033e9e59ef7009891f7ede789e751708a40306c819cd821b1dc1816a8f4"

RPROVIDES:${PN} += "ghc-mime-types \
libHSmime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

SUMMARY = "Generic HTTP types for Haskell (for both client and server code)"
DESCRIPTION = "Generic HTTP types for Haskell (for both client and server code)."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-0.12.3-6.9.aarch64.rpm"
RPM_HASH = "637d56d447a0b4411ab9f91ac57b9daf0e22970821fd1c2de7887c396c915cc0b60be223852acbfa6dd4ef6ffd85f7da1b10403b64d1fa3b51ec7448cffab8ac"

RPROVIDES:${PN} += "ghc-http-types \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

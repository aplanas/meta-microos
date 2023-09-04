SUMMARY = "Type definitions for Universally Unique Identifiers"
DESCRIPTION = "This library contains type definitions for <https://en.wikipedia.org/wiki/UUID \
Universally Unique Identifiers (UUID)> (as specified in \
<http://tools.ietf.org/html/rfc4122 RFC 4122>) and basic conversion functions. \
 \
See also the <https://hackage.haskell.org/package/uuid 'uuid' package> \
providing a high-level API for managing the different UUID versions."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-1.0.5-5.4.aarch64.rpm"
RPM_HASH = "13a45edd5cf9e39adf4672517fafa63f3d83cdefbccf28dc056ef5579f21d25073ec06a033b12614af15945152d96fbca09783f311f4c3186e55591b1f55fdbc"

RPROVIDES:${PN} += "ghc-uuid-types \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

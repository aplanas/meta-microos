SUMMARY = "Access Unicode Character Database (UCD)"
DESCRIPTION = "'unicode-data' provides Haskell APIs to efficiently access the \
<https://www.unicode.org/ucd/ Unicode character database> (UCD). \
Performance is the primary goal in the design of this package. \
 \
The Haskell data structures are generated programmatically from the UCD files. \
The latest Unicode version supported by this library is \
'<https://www.unicode.org/versions/Unicode15.0.0/ 15.0.0>'."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-0.4.0.1-3.8.aarch64.rpm"
RPM_HASH = "b13bbd19cf51d31d27590c0e7960b91e6d8187f460e3a9f2c487331450fd9ca7b548e07e29bd08b42d668d202ffe3368ac9241b2d7b28090d0f0446c59c3808e"

RPROVIDES:${PN} += "ghc-unicode-data \
libHSunicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

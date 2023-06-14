SUMMARY = "Lightweight package providing commonly useful parser combinators"
DESCRIPTION = "Lightweight package providing commonly useful parser combinators."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-1.3.0-2.3.aarch64.rpm"
RPM_HASH = "52754af24996f03907dcbed5b24e884637040b9dafcf76e62d518059eda40473d25ed4e71d5f8e3b31c4d008d430a026ebcffb63e7c5cab7e45d4345b5601bb4"

RPROVIDES:${PN} += "ghc-parser-combinators \
libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

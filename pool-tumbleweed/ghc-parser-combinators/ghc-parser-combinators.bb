SUMMARY = "Lightweight package providing commonly useful parser combinators"
DESCRIPTION = "Lightweight package providing commonly useful parser combinators."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-1.3.0-2.8.aarch64.rpm"
RPM_HASH = "d749a1e42e3874a97299d17b60281cf5e9c96e20b6e0a67be08c17b73142a517abeb8ecb632f0cc05014b967b0cde1217cc2b6c7c0fc44d05a2a6e616b2f655e"

RPROVIDES:${PN} += "ghc-parser-combinators \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

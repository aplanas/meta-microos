SUMMARY = "Opinionated, but extensible Lua list type"
DESCRIPTION = "List type for Lua, with a Haskell interface."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "c5c4ef68f97a3e7c9dbc249702e9ab22cf30d6f11ff737caf1d1d55d416ef0a19e8224b5a0a511b5dfc31f142b5f4ba7398a29f165bfeb4c80067c6a860ab9bf"

RPROVIDES:${PN} += "ghc-hslua-list \
ghc-hslua-list(aarch-64) \
libHShslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit) \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

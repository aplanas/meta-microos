SUMMARY = "A library for simple INI-based configuration files"
DESCRIPTION = "The 'config-ini' library is a set of small monadic languages for writing simple \
configuration languages with convenient, human-readable error messages. \
 \
> parseConfig :: IniParser (Text, Int, Bool) > parseConfig = section 'NETWORK' \
$ do > user <- field 'user' > port <- fieldOf 'port' number > enc <- \
fieldFlagDef 'encryption' True > return (user, port, enc)."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-0.2.6.0-1.5.aarch64.rpm"
RPM_HASH = "719c894f7d3b725255dde71fdf4e45e640c7270d218fa480edc0e96bb802d1023c254ea370fa961341eb32af8a594ec270327358dcfc0a049b6325fe84fae7ed"

RPROVIDES:${PN} += "ghc-config-ini \
libHSconfig-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm-ghc9.4.6.so"

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
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmegaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

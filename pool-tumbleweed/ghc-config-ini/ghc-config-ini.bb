SUMMARY = "A library for simple INI-based configuration files"
DESCRIPTION = "The 'config-ini' library is a set of small monadic languages for writing simple \
configuration languages with convenient, human-readable error messages. \
 \
> parseConfig :: IniParser (Text, Int, Bool) > parseConfig = section 'NETWORK' \
$ do > user <- field 'user' > port <- fieldOf 'port' number > enc <- \
fieldFlagDef 'encryption' True > return (user, port, enc)."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-0.2.6.0-1.2.aarch64.rpm"
RPM_HASH = "aceca82250288505b4c25b1054f34deca1b01bca2d2731c9311d1bf68069c84e4312d2d5d241014126ac9b6534268f6be7970b14f3abbc36139f725aa3ffaba2"

RPROVIDES:${PN} += "ghc-config-ini \
libHSconfig-ini-0.2.6.0-FZ1GgaSPQSr5D8UkvN7nbq-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSmegaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

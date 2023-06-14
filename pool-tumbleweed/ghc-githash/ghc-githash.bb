SUMMARY = "Compile git revision info into Haskell projects"
DESCRIPTION = "Compile git revision info into Haskell projects."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.3"

RPM_NAME = "ghc-githash-0.1.6.3-2.3.aarch64.rpm"
RPM_HASH = "87b418892b198a89ddaf1f3ddea454a3a4fa1023e01b12e6148115d88e51a92d98ae13bedf08747aa55403d1a791714cc47a5e256543a6bd3111aa5a6ae70235"

RPROVIDES:${PN} += "ghc-githash \
libHSgithash-0.1.6.3-FrkvdbOWDB4772dnMETpxS-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

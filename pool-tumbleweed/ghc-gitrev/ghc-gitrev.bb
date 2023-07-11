SUMMARY = "Compile git revision info into Haskell projects"
DESCRIPTION = "Some handy Template Haskell splices for including the current git hash and \
branch in the code of your project. Useful for including in panic messages, \
'--version' output, or diagnostic info for more informative bug reports."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-1.3.1-9.3.aarch64.rpm"
RPM_HASH = "9a599998bb65bcee35197eec5ca89f404a39a33fb59cc62acb97bc71f41d88ad38f119cfc1ae40aca73d96ac45a04b66513a64bfcbacf8d5deb0ef78f506a829"

RPROVIDES:${PN} += "ghc-gitrev \
libHSgitrev-1.3.1-CQYGfdCfGPeA3DF217wQTZ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
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
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

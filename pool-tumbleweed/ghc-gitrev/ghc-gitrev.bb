SUMMARY = "Compile git revision info into Haskell projects"
DESCRIPTION = "Some handy Template Haskell splices for including the current git hash and \
branch in the code of your project. Useful for including in panic messages, \
'--version' output, or diagnostic info for more informative bug reports."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-1.3.1-9.2.aarch64.rpm"
RPM_HASH = "cf2dd3ef37a91d1c609600cfb0446b0b9686795acd255dfd6f1f9f99180a6b3f6b48fb2a716f70ffa3b86eddd1f876f1e73528f6429d49c4e9077ef6a431451f"

RPROVIDES:${PN} += "ghc-gitrev \
libHSgitrev-1.3.1-Fh7rxVehK3vCpE8f2RFTGz-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so \
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

SUMMARY = "A blazingly fast markup combinator library for Haskell"
DESCRIPTION = "Core modules of a blazingly fast markup combinator library for the Haskell \
programming language. The Text.Blaze module is a good starting point, as well \
as this tutorial: <http://jaspervdj.be/blaze/tutorial.html>."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-0.8.2.8-6.4.aarch64.rpm"
RPM_HASH = "9039d55c6031eee215cbca643e515324ff7303b6090116f233c6e8d2fa10af1248337d26b65a252c4ab8520d12a3696f9079620dc780ef3fa085cb3589e2c5b9"

RPROVIDES:${PN} += "ghc-blaze-markup \
libHSblaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

SUMMARY = "Crypto Pseudo Random Number Generator using AES in counter mode"
DESCRIPTION = "Simple crypto pseudo-random-number-generator with really good randomness \
property. \
 \
Using ent, a randomness property maker on one 1Mb sample: Entropy = 7.999837 \
bits per byte. Optimum compression would reduce the size of this 1048576 byte \
file by 0 percent. Chi square distribution for 1048576 samples is 237.02 \
Arithmetic mean value of data bytes is 127.3422 (127.5 = random) Monte Carlo \
value for Pi is 3.143589568 (error 0.06 percent) \
 \
Compared to urandom with the same sampling: Entropy = 7.999831 bits per byte. \
Optimum compression would reduce the size of this 1048576 byte file by 0 \
percent. Chi square distribution for 1048576 samples is 246.63 Arithmetic mean \
value of data bytes is 127.6347 (127.5 = random). Monte Carlo value for Pi is \
3.132465868 (error 0.29 percent)."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-0.6.1-4.3.aarch64.rpm"
RPM_HASH = "46fe42bec1511c41d1b0eb67bdd5f569d95cb458924d2fbb0935d13ab8546b3a3cce57bba72c53c81bfe13f5b2e306635300d441744af2f079b6edd7ff64a090"

RPROVIDES:${PN} += "ghc-cprng-aes \
libHScprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK-ghc9.4.5.so \
libHScrypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz-ghc9.4.5.so \
libHScrypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

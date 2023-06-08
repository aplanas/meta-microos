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

RPM_NAME = "ghc-cprng-aes-0.6.1-4.2.aarch64.rpm"
RPM_HASH = "a3e98f1e25300238cc3b205d6862b93207f5809e6af0c64874b4caf543ea6aefc5123fbea449d5505439abbf0cac569cb18bddbb397fa4c4c9aa464a58baad04"

RPROVIDES:${PN} += "ghc-cprng-aes ghc-cprng-aes(aarch-64) libHScprng-aes-0.6.1-169qys47NiB5UR1VcEjGCA-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi-ghc9.4.5.so()(64bit) libHScrypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52-ghc9.4.5.so()(64bit) libHScrypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

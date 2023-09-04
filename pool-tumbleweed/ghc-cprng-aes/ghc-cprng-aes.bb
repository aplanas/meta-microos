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

RPM_NAME = "ghc-cprng-aes-0.6.1-5.2.aarch64.rpm"
RPM_HASH = "d8536376c2dbda16486f1b54186dfb7847f36e8254188f51f9575241ee2f65155a2eb35a7201ebb20f567c56cb7032c9d70c3cfc2e6adadf0898339d40f2dd08"

RPROVIDES:${PN} += "ghc-cprng-aes \
libHScprng-aes-0.6.1-AH5syEkNtcCLtLNSEwAncX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbyteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG-ghc9.4.6.so \
libHScrypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl-ghc9.4.6.so \
libHScrypto-random-0.0.9-EARwXMpyWawUPhdi0weks-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSsecuremem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

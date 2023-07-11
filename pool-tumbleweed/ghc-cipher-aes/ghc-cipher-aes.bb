SUMMARY = "Fast AES cipher implementation with advanced mode of operations"
DESCRIPTION = "Fast AES cipher implementation with advanced mode of operations. \
 \
The modes of operations available are ECB (Electronic code book), CBC (Cipher \
block chaining), CTR (Counter), XTS (XEX with ciphertext stealing), GCM (Galois \
Counter Mode). \
 \
The AES implementation uses AES-NI when available (on x86 and x86-64 \
architecture), but fallback gracefully to a software C implementation. \
 \
The software implementation uses S-Boxes, which might suffer for cache timing \
issues. However do notes that most other known software implementations, \
including very popular one (openssl, gnutls) also uses similar implementation. \
If it matters for your case, you should make sure you have AES-NI available, or \
you'll need to use a different implementation."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-0.2.11-4.4.aarch64.rpm"
RPM_HASH = "3e636916697c2d4b502ae2981174d0e72fa5de5df3ce8ac0aa7a645f0aca39c6c77469e849bb032db82aad2d43ea10ca8dc1b2892eed074cf7518c0a2bd2709e"

RPROVIDES:${PN} += "ghc-cipher-aes \
libHScipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScrypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

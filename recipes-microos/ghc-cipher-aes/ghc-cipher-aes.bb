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

RPM_NAME = "ghc-cipher-aes-0.2.11-4.2.aarch64.rpm"
RPM_HASH = "62b5d9265d906ad0c980a2f7a3edef9669a899aecb3db11bd8fe05276bbeee64b3bf0afcce3031852cfb1c82b53d091f1c19fcc813cabf517ce1c3aa33925dd8"

RPROVIDES:${PN} += "ghc-cipher-aes ghc-cipher-aes(aarch-64) libHScipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so()(64bit) libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScrypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

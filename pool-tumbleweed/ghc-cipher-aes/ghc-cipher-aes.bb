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

RPM_NAME = "ghc-cipher-aes-0.2.11-4.5.aarch64.rpm"
RPM_HASH = "59485713228236f045509267eb3397bf85421201869a9f4380ffeb369ca281c98c1175695ee0642a3dd792cdaeafb42f90cc24c313ba8b5547968346bc48aca7"

RPROVIDES:${PN} += "ghc-cipher-aes \
libHScipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbyteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScrypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsecuremem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

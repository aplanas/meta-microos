SUMMARY = "Parse and display time according to some RFCs (RFC3339, RFC2822, RFC822)"
DESCRIPTION = "Parse and display time according to some RFC's. \
 \
Supported: \
 \
* RFC822 <http://www.ietf.org/rfc/rfc0822.txt> \
 \
* RFC2822 <http://www.ietf.org/rfc/rfc2822.txt> \
 \
* RFC3339 <http://www.ietf.org/rfc/rfc3339.txt> \
 \
Special thanks to Koral for all the suggestions and help in solving some bugs."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-2.1.0.0-1.11.aarch64.rpm"
RPM_HASH = "74babb0d734965503eb813f9e76b01ebaab1f715e9c46c01ef94525df5012930231cbcb643e7554126619a3ed229dd315b995f54a3060bfd1ae589f15a71b378"

RPROVIDES:${PN} += "ghc-timerep \
libHStimerep-2.1.0.0-7Ytum8O35f0BaW4NCEYMdH-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScommutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmonoid-subclasses-1.2.3-5taTwF7VZKRLlaKR3bOBXt-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimes-0.2.1.0-Gyap6mKLPxs4D6ga1tuZTq-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

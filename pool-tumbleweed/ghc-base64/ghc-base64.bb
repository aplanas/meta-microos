SUMMARY = "A modern RFC 4648-compliant Base64 library"
DESCRIPTION = "RFC 4648-compliant Base64 with an eye towards performance and modernity \
(additional support for RFC 7049 standards)."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-0.4.2.4-3.9.aarch64.rpm"
RPM_HASH = "e9414ba37d4e2a672a1ecf0bcb8d9536ca745a14dd15edd845e5c1282ab4e0e488a38bf138b7483fdc016557ba5325f58bf88d38262a811436eade4f9b18e560"

RPROVIDES:${PN} += "ghc-base64 \
libHSbase64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

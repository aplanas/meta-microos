SUMMARY = "A platform independent entropy source"
DESCRIPTION = "A mostly platform independent method to obtain cryptographically strong entropy \
(RDRAND, urandom, CryptAPI, and patches welcome) Users looking for \
cryptographically strong (number-theoretically sound) PRNGs should see the \
'DRBG' package too."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-0.4.1.10-3.4.aarch64.rpm"
RPM_HASH = "1cbb56c05b818b6e8d7240110ccb0412a7bd98c833f52a0cc88ec5d674476e97c7df193351c53a3c792490612ee58c266f140630559887d0c8287d957e0d00bc"

RPROVIDES:${PN} += "ghc-entropy \
libHSentropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

SUMMARY = "A platform independent entropy source"
DESCRIPTION = "A mostly platform independent method to obtain cryptographically strong entropy \
(RDRAND, urandom, CryptAPI, and patches welcome) Users looking for \
cryptographically strong (number-theoretically sound) PRNGs should see the \
'DRBG' package too."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-0.4.1.10-3.3.aarch64.rpm"
RPM_HASH = "6d49ba90c129dc507b815ae1f874b72533903c823c6a96e24a51c81328b8c47dde8bc0f3a10e95719260f58931e311894143e15d1de800b8117335f07d186559"

RPROVIDES:${PN} += "ghc-entropy \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

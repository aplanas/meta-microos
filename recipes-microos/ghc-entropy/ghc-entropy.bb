SUMMARY = "A platform independent entropy source"
DESCRIPTION = "A mostly platform independent method to obtain cryptographically strong entropy \
(RDRAND, urandom, CryptAPI, and patches welcome) Users looking for \
cryptographically strong (number-theoretically sound) PRNGs should see the \
'DRBG' package too."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-0.4.1.10-3.2.aarch64.rpm"
RPM_HASH = "98b177c72b5b98afc7b92b8f3cdf45dbf04a3889238383790dd99f7fa9df5ce75cae06dccc4e3f448900914df4d8fc3c974ededb801e084c6b6c7fe9cdabd799"

RPROVIDES:${PN} += "ghc-entropy ghc-entropy(aarch-64) libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.25)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm

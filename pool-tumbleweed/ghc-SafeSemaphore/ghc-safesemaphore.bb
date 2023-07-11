SUMMARY = "Much safer replacement for QSemN, QSem, and SampleVar"
DESCRIPTION = "This provides a much safer semaphore than the QSem, QSemN, SampleVar in base. \
Those base modules are not exception safe and can be broken by killThread. \
See <https://github.com/ChrisKuklewicz/SafeSemaphore> for more details."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-0.10.1-5.6.aarch64.rpm"
RPM_HASH = "3212345cc212ea6055334ac0ce2c481f4450b9c9ee1e82abaa788e6f7d17d637b320619e37dcd12092f58aad6e281273ee7068d8fce08edc03599126b22f9ca4"

RPROVIDES:${PN} += "ghc-SafeSemaphore \
libHSSafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

SUMMARY = "Much safer replacement for QSemN, QSem, and SampleVar"
DESCRIPTION = "This provides a much safer semaphore than the QSem, QSemN, SampleVar in base. \
Those base modules are not exception safe and can be broken by killThread. \
See <https://github.com/ChrisKuklewicz/SafeSemaphore> for more details."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-0.10.1-5.8.aarch64.rpm"
RPM_HASH = "1f9af521d87d0747929854dcd0af391c1ce43e522252123c85bb7b57ffac5893451aac7e97ebb87919746e47354c7c5bfa190c5613f8a630f69998b8f7f2d0eb"

RPROVIDES:${PN} += "ghc-SafeSemaphore \
libHSSafeSemaphore-0.10.1-8vfV4kQtVdq7fGz6bQJt9f-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

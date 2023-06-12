SUMMARY = "Much safer replacement for QSemN, QSem, and SampleVar"
DESCRIPTION = "This provides a much safer semaphore than the QSem, QSemN, SampleVar in base. \
Those base modules are not exception safe and can be broken by killThread. \
See <https://github.com/ChrisKuklewicz/SafeSemaphore> for more details."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-0.10.1-5.3.aarch64.rpm"
RPM_HASH = "8638ae27a31be8a639ad115640cf38f449af9ce92ed295658e6e084977e8794ac722b903bfb67c0f4efb7b5e01e0c56965568df159cd1146d758b3aa68103952"

RPROVIDES:${PN} += "ghc-SafeSemaphore \
ghc-SafeSemaphore(aarch-64) \
libHSSafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
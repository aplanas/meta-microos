SUMMARY = "Data encoding library"
DESCRIPTION = "Reasonably fast data encoding library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-0.5-5.3.aarch64.rpm"
RPM_HASH = "2ea237fd42e4393312d64ba4cfe88c9c73fde52e5c96e6fd0492572d72d29164098448dc582a51d707c67a96ad2363d8d5df28cbdfccea4471577db938a29ea6"

RPROVIDES:${PN} += "ghc-sandi \
ghc-sandi(aarch-64) \
libHSsandi-0.5-G6Jka3yQQG77V9ypm6cnaU-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so()(64bit) \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

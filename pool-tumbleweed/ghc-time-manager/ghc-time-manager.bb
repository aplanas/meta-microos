SUMMARY = "Scalable timer"
DESCRIPTION = "Scalable timer functions provided by a timer manager."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "ghc-time-manager-0.0.1-1.1.aarch64.rpm"
RPM_HASH = "a8fe30d1b42e413828a294118b2344cb62e90edddcde64748a56bd76a2cd2842fd75a33cb26db68c3fc98e5816560ecd00f0732ee23ade5a39dc85067ff63b47"

RPROVIDES:${PN} += "ghc-time-manager \
libHStime-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSauto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSsafe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

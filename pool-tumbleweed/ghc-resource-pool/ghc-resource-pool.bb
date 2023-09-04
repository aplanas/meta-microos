SUMMARY = "A high-performance striped resource pooling implementation"
DESCRIPTION = "A high-performance striped pooling abstraction for managing flexibly-sized \
collections of resources such as database connections."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-0.4.0.0-2.9.aarch64.rpm"
RPM_HASH = "13f028153dc2b81569178c7b8efe5da818bb3be33d7cfff27383a7a3f5ff20b7edeff6d605b09e8a63b947764df1c2148b63bb476caa10e6329bbaab354d2399"

RPROVIDES:${PN} += "ghc-resource-pool \
libHSresource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty-ghc9.4.6.so"

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
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

SUMMARY = "Streaming data processing library"
DESCRIPTION = "`conduit` is a solution to the streaming data problem, allowing for production, \
transformation, and consumption of streams of data in constant memory. \
It is an alternative to lazy I/O which guarantees deterministic resource \
handling. \
 \
For more information about conduit in general, and how this package in \
particular fits into the ecosystem, see [the conduit \
homepage](https://github.com/snoyberg/conduit#readme). \
 \
Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/conduit>."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "ghc-conduit-1.3.5-1.7.aarch64.rpm"
RPM_HASH = "3e9ca739db409ae3a568db065e68213c47e483d774bdbd2029f244ed80b4a77740c5441dc98dd5cb7679b667fca857555cdac34f1ceb16ed2574e047a4126c88"

RPROVIDES:${PN} += "ghc-conduit \
libHSconduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
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
libHSmono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

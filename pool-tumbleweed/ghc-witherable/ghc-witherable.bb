SUMMARY = "Filterable traversable"
DESCRIPTION = "A stronger variant of `traverse` which can remove elements and generalised \
mapMaybe, catMaybes, filter."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-0.4.2-4.6.aarch64.rpm"
RPM_HASH = "a356d7a6dad3d900d396aeb1de62dd65d94d08984b6a8b8fde44b6f81cb706d4b13f535c759d7ca259ef914e4b208904fab7592dbebed26a8665dc62b71bcc99"

RPROVIDES:${PN} += "ghc-witherable \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

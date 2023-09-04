SUMMARY = "Dockerfile parser, pretty-printer and embedded DSL"
DESCRIPTION = "All functions for parsing and pretty-printing Dockerfiles are exported through \
'Language.Docker'. For more fine-grained operations look for specific modules \
that implement a certain functionality. See the \
<https://github.com/hadolint/language-docker GitHub project> for the \
source-code and examples."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-11.0.0-1.10.aarch64.rpm"
RPM_HASH = "b45dd94f02b9807f388def30c50b2da077cbfecb8ad90d03c12435593b61d96b52792a1f2e1fdcf4edeef4e42e4e9f5114d7778a0eda9bfce58f8f787a00384f"

RPROVIDES:${PN} += "ghc-language-docker \
libHSlanguage-docker-11.0.0-2HEqMTVikVZEgpsCXsz3Cq-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmegaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

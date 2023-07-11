SUMMARY = "Robust, reliable performance measurement and analysis"
DESCRIPTION = "This library provides a powerful but simple way to measure software \
performance. It provides both a framework for executing and analysing \
benchmarks and a set of driver functions that makes it easy to build and run \
benchmarks, and to analyse their results. \
 \
The fastest way to get started is to read the \
<http://www.serpentine.com/criterion/tutorial.html online tutorial>, followed \
by the documentation and examples in the 'Criterion.Main' module. \
 \
For examples of the kinds of reports that criterion generates, see \
<http://www.serpentine.com/criterion the home page>."
LICENSE = "BSD-2-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-criterion-1.6.2.0-2.2.aarch64.rpm"
RPM_HASH = "e2028ac3178566c2fb66d46e047c5ad9c396ae47d7da3a26d1e337c232c0de3ebf34a554acfd42d0af7a2c07821218837e9c4cba867a844ecb8ad8b215c51524"

RPROVIDES:${PN} += "ghc-criterion \
libHScriterion-1.6.2.0-5spSpmuGxtIL4vjcevw11g-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSGlob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R-ghc9.4.5.so \
libHSOneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV-ghc9.4.5.so \
libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so \
libHSQuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov-ghc9.4.5.so \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSassoc-1.1-H3gdf0Ue1d5sn9822dJ4G-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
libHSbase-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbinary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD-ghc9.4.5.so \
libHScode-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHScriterion-measurement-0.2.1.0-DbdcwZpcXTnArPRmwcriLh-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdata-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSjs-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d-ghc9.4.5.so \
libHSmath-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk-ghc9.4.5.so \
libHSmicrostache-1.0.2.3-HPIMoirZDKg7hPtdxDNWtL-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSmwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP-ghc9.4.5.so \
libHSoptparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff-ghc9.4.5.so \
libHSparallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2-ghc9.4.5.so \
libHSprettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsemialign-1.3-D9a6dNA89ZHcaXKxWN9Am-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstatistics-0.16.2.0-KAkoTXt1eFLCqUuIxaQQe3-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstrict-0.5-BMGWBclA5sg312fCUlbuTw-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSthese-1.2-3gvRWs9hjHpLbWG1JfTveA-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSvector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t-ghc9.4.5.so \
libHSwitherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm

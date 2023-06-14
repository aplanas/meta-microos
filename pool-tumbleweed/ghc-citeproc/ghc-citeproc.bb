SUMMARY = "Generates citations and bibliography from CSL styles"
DESCRIPTION = "Citeproc parses CSL style files and uses them to generate a list of formatted \
citations and bibliography entries. For more information about CSL, see \
<https://citationstyles.org/>."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "252beec9b4f61679fa8de92e3fb192b268c2314d204b2c720a0e1b24079873b6933cd186b60ca606de8a1f13569c1cceee1155ce8bd5ce5126235399c68cd9f3"

RPROVIDES:${PN} += "ghc-citeproc \
libHSciteproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so \
libHSQuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so \
libHSbase-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so \
libHSconduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHSdata-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdata-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz-ghc9.4.5.so \
libHSdata-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf-ghc9.4.5.so \
libHSdata-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo-ghc9.4.5.so \
libHSdata-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSpandoc-types-1.23-EFziwPO22I72D2SxHphq63-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsemialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
libHSunicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP-ghc9.4.5.so \
libHSuniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSwitherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh-ghc9.4.5.so \
libHSxml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4-ghc9.4.5.so \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm

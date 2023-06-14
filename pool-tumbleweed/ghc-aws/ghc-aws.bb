SUMMARY = "Amazon Web Services (AWS) for Haskell"
DESCRIPTION = "Bindings for Amazon Web Services (AWS), with the aim of supporting all AWS \
services. To see a high level overview of the library, see the README at \
<https://github.com/aristidb/aws/blob/master/README.md>."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-0.23-1.4.aarch64.rpm"
RPM_HASH = "fe60a5f0724f290e832d7df21f17eca56cfe251ea721e5691072643a6d96463143719559ba6fe34bf70ddbaa903daaa2b4e03ce24ccd3d5d750086daa8f746f8"

RPROVIDES:${PN} += "ghc-aws \
libHSaws-0.23-3doj4K3gEsgA7HfIcBeC8x-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so \
libHSQuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP-ghc9.4.5.so \
libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk-ghc9.4.5.so \
libHSasn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV-ghc9.4.5.so \
libHSasn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm-ghc9.4.5.so \
libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so \
libHSbase-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHSconduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2-ghc9.4.5.so \
libHSconduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr-ghc9.4.5.so \
libHSconnection-0.3.1-IDyFh0K8hgZvp3uiDVm7m-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so \
libHScryptonite-0.30-AbDFzA14dNKDfU9pLpBLye-ghc9.4.5.so \
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
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215-ghc9.4.5.so \
libHShttp-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0-ghc9.4.5.so \
libHShttp-conduit-2.3.8-9gcbWW2UjPVHQDceZSAOIR-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSiproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd-ghc9.4.5.so \
libHSlifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so \
libHSmonad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSnetwork-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsemialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsocks-0.6.1-CAd82jbrmKj2bUx8fkWhGg-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStls-1.6.0-48osxqPawrs8SblkErmTaM-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSwitherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh-ghc9.4.5.so \
libHSx509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw-ghc9.4.5.so \
libHSx509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt-ghc9.4.5.so \
libHSx509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7-ghc9.4.5.so \
libHSx509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO-ghc9.4.5.so \
libHSxml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4-ghc9.4.5.so \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm

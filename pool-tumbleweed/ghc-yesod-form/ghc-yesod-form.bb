SUMMARY = "Form handling support for Yesod Web Framework"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/yesod-form>. Third-party packages which you \
can find useful: <http://hackage.haskell.org/package/yesod-form-richtext \
yesod-form-richtext> - richtext form fields (currently it provides only \
Summernote support)."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-1.7.4-1.7.aarch64.rpm"
RPM_HASH = "e62409375418055b2a2d478bead4caf0e763da6eaf6babb1c93e49551eb64f3797b99e804b92633da335d065db1b4a24faa75989461afd32291559dcc148ee30"

RPROVIDES:${PN} += "ghc-yesod-form \
libHSyesod-form-1.7.4-3XbqFtOs3TKAgriMSKjDj2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSHUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb-ghc9.4.5.so \
libHSOneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV-ghc9.4.5.so \
libHSQuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov-ghc9.4.5.so \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt-ghc9.4.5.so \
libHSasn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm-ghc9.4.5.so \
libHSasn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx-ghc9.4.5.so \
libHSassoc-1.1-H3gdf0Ue1d5sn9822dJ4G-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSattoparsec-iso8601-1.1.0.0-7warWbAa4NQL4IDzyErxXZ-ghc9.4.5.so \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
libHSbase-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK-ghc9.4.5.so \
libHSclientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHSconduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr-ghc9.4.5.so \
libHSconduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so \
libHScprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk-ghc9.4.5.so \
libHScrypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE-ghc9.4.5.so \
libHScrypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz-ghc9.4.5.so \
libHScrypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
libHScss-text-0.1.3.0-21S5OjTqOp19taDQmfqmQs-ghc9.4.5.so \
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
libHSeasy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF-ghc9.4.5.so \
libHSemail-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD-ghc9.4.5.so \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN-ghc9.4.5.so \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J-ghc9.4.5.so \
libHShttp-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHShttp2-3.0.3-COVYRU9DHikEztQPG0mdmy-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSiproute-1.7.12-IhoklPQYItb8qGu1G3vmcD-ghc9.4.5.so \
libHSlift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB-ghc9.4.5.so \
libHSlifted-base-0.2.3.12-2PslaVNAATq3HzvkpdIGSo-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSmonad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX-ghc9.4.5.so \
libHSmonad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW-ghc9.4.5.so \
libHSmonad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpath-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4-ghc9.4.5.so \
libHSpem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS-ghc9.4.5.so \
libHSpersistent-2.14.5.0-9uJ7TxdgaWz5Ow6lrik7k2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSpsqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSrecv-0.1.0-5l0GOJwksOA59K6H5tIdgO-ghc9.4.5.so \
libHSresource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHSsemialign-1.3-D9a6dNA89ZHcaXKxWN9Am-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSsetenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x-ghc9.4.5.so \
libHSshakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj-ghc9.4.5.so \
libHSsilently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR-ghc9.4.5.so \
libHSsimple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb-ghc9.4.5.so \
libHSskein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu-ghc9.4.5.so \
libHSstrict-0.5-BMGWBclA5sg312fCUlbuTw-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so \
libHSthese-1.2-3gvRWs9hjHpLbWG1JfTveA-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStime-manager-0.0.0-49hD2RcPrUEG8anOiBePCj-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so \
libHSunix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0-ghc9.4.5.so \
libHSunliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libHSvault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSwai-3.2.3-B6oJGZed88IFIvDpwN5I7x-ghc9.4.5.so \
libHSwai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU-ghc9.4.5.so \
libHSwai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE-ghc9.4.5.so \
libHSwarp-3.3.25-7qOcByHeVpuMAFF4vrupa-ghc9.4.5.so \
libHSwitherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH-ghc9.4.5.so \
libHSword8-0.1.3-9uGjviso2af8K0EP8UmxRD-ghc9.4.5.so \
libHSx509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la-ghc9.4.5.so \
libHSxss-sanitize-0.3.7.2-FCgYumvpQn8Hd22tbbEcXW-ghc9.4.5.so \
libHSyesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH-ghc9.4.5.so \
libHSyesod-persistent-1.6.0.8-FGWkxx7rXiRFDcm3y5XVcs-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm

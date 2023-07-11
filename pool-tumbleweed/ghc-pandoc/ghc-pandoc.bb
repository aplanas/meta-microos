SUMMARY = "Conversion between markup formats"
DESCRIPTION = "Pandoc is a Haskell library for converting from one markup format to another. \
The formats it can handle include \
 \
- light markup formats (many variants of Markdown, reStructuredText, AsciiDoc, \
Org-mode, Muse, Textile, txt2tags) - HTML formats (HTML 4 and 5) - Ebook \
formats (EPUB v2 and v3, FB2) - Documentation formats (GNU TexInfo, Haddock) - \
Roff formats (man, ms) - TeX formats (LaTeX, ConTeXt) - Typst - XML formats \
(DocBook 4 and 5, JATS, TEI Simple, OpenDocument) - Outline formats (OPML) - \
Bibliography formats (BibTeX, BibLaTeX, CSL JSON, CSL YAML, RIS) - Word \
processor formats (Docx, RTF, ODT) - Interactive notebook formats (Jupyter \
notebook ipynb) - Page layout formats (InDesign ICML) - Wiki markup formats \
(MediaWiki, DokuWiki, TikiWiki, TWiki, Vimwiki, XWiki, ZimWiki, Jira wiki, \
Creole) - Slide show formats (LaTeX Beamer, PowerPoint, Slidy, reveal.js, \
Slideous, S5, DZSlides) - Data formats (CSV and TSV tables) - PDF (via external \
programs such as pdflatex or wkhtmltopdf) \
 \
Pandoc can convert mathematical content in documents between TeX, MathML, Word \
equations, roff eqn, typst, and plain text. It includes a powerful system for \
automatic citations and bibliographies, and it can be customized extensively \
using templates, filters, and custom readers and writers written in Lua."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-3.1.3-1.3.aarch64.rpm"
RPM_HASH = "3208ad676be3bac696c323138982338ce4c6bb907013598b27320f9fd18359b34f04f1d0a9161394098dc5052d361c213cec8f761adc86b5605e0d59be9d6553"

RPROVIDES:${PN} += "ghc-pandoc \
libHSpandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4-ghc9.4.5.so \
libHSpandoc-3.1.3-KZifERN8HNyEKa03sDY3cX-xml-light-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSGlob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R-ghc9.4.5.so \
libHSJuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS-ghc9.4.5.so \
libHSOneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV-ghc9.4.5.so \
libHSOnly-0.1-ETd5YCT0TwGLbN8rgpgTS8-ghc9.4.5.so \
libHSQuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X-ghc9.4.5.so \
libHSSHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov-ghc9.4.5.so \
libHSaeson-pretty-0.8.9-ANiMUyahKok8eMC9BUYvO0-ghc9.4.5.so \
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
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
libHSbase-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so \
libHSbase64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHSciteproc-0.8.1-Ex3LMLw4y9Q5nAZv8bt8hk-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScommonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G-ghc9.4.5.so \
libHScommonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J-ghc9.4.5.so \
libHScommonmark-pandoc-0.2.1.3-HVNPkFgx18RJMldDwlSrf3-ghc9.4.5.so \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so \
libHSconduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr-ghc9.4.5.so \
libHSconduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2-ghc9.4.5.so \
libHSconnection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScontravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao-ghc9.4.5.so \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so \
libHScryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ-ghc9.4.5.so \
libHSdata-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdata-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz-ghc9.4.5.so \
libHSdata-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf-ghc9.4.5.so \
libHSdata-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo-ghc9.4.5.so \
libHSdata-fix-0.3.2-LdyR2jsAdh33KJZuVTGWPw-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so \
libHSdoclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0-ghc9.4.5.so \
libHSdoctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp-ghc9.4.5.so \
libHSemojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSgridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS-ghc9.4.5.so \
libHShaddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ-ghc9.4.5.so \
libHShttp-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSiproute-1.7.12-IhoklPQYItb8qGu1G3vmcD-ghc9.4.5.so \
libHSipynb-0.2-L0fucXiR4UEfjFQwta2fV-ghc9.4.5.so \
libHSjira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH-ghc9.4.5.so \
libHSlibyaml-0.1.2-6Gx0z1LjMeG6dZCnkkkmHj-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT-ghc9.4.5.so \
libHSpandoc-types-1.23-4C1nzwOnt973xRAA9sp531-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSpretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so \
libHSregex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsemialign-1.3-D9a6dNA89ZHcaXKxWN9Am-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSskylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp-ghc9.4.5.so \
libHSskylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv-ghc9.4.5.so \
libHSskylighting-format-ansi-0.1-7wsekCwokAw5Lqh6kWpqBT-ghc9.4.5.so \
libHSskylighting-format-blaze-html-0.1.1-F12UWgv4wxWHCG1WBLqTVs-ghc9.4.5.so \
libHSskylighting-format-context-0.1.0.2-9kgX49cteJhG5oRziiwfwa-ghc9.4.5.so \
libHSskylighting-format-latex-0.1-8E2kKavCeIp7J2nfRBTdHs-ghc9.4.5.so \
libHSsocks-0.6.1-8gBEgerYb38E7aCOOcHCwN-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu-ghc9.4.5.so \
libHSstrict-0.5-BMGWBclA5sg312fCUlbuTw-ghc9.4.5.so \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStemporary-1.3-9rLWZg49Shk3gKExST32p-ghc9.4.5.so \
libHStexmath-0.12.8-JGsJwuKtD7b26p8DVW0WBw-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so \
libHSthese-1.2-3gvRWs9hjHpLbWG1JfTveA-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStls-1.6.0-GPxmmQRGk0xt2NkvZcJeD-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
libHStypst-0.1.0.0-3VBCZ4Q02O47LMJn0K0CF8-ghc9.4.5.so \
libHStypst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u-ghc9.4.5.so \
libHSunicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP-ghc9.4.5.so \
libHSunicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO-ghc9.4.5.so \
libHSunicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO-ghc9.4.5.so \
libHSuniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSwitherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH-ghc9.4.5.so \
libHSx509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la-ghc9.4.5.so \
libHSx509-store-1.6.9-KWawLwgFfWnohDCwWLuXH-ghc9.4.5.so \
libHSx509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t-ghc9.4.5.so \
libHSx509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo-ghc9.4.5.so \
libHSxml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g-ghc9.4.5.so \
libHSxml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon-ghc9.4.5.so \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so \
libHSyaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW-ghc9.4.5.so \
libHSzip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm

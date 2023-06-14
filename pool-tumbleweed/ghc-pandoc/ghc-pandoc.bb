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

PV = "3.1.2"

RPM_NAME = "ghc-pandoc-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "362fc813d04fe9a446d73844a7f712dcd2686381c2a2d473ae777d04dbdb84730471d5c987cce78eae0918ba6deb69832c2f0aa2b0c196b5f6dc61c858eba8e7"

RPROVIDES:${PN} += "ghc-pandoc \
libHSpandoc-3.1.2-4COa82weJXB97OkqjDlb3I-ghc9.4.5.so \
libHSpandoc-3.1.2-H0ogU2eolzfu1WzsdvpBp-xml-light-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSGlob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R-ghc9.4.5.so \
libHSJuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS-ghc9.4.5.so \
libHSOneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd-ghc9.4.5.so \
libHSQuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6-ghc9.4.5.so \
libHSSHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW-ghc9.4.5.so \
libHSStateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN-ghc9.4.5.so \
libHSaeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP-ghc9.4.5.so \
libHSaeson-pretty-0.8.9-LUjG36DF6cc5sU1N5Uw0pr-ghc9.4.5.so \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
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
libHSbase64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSblaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR-ghc9.4.5.so \
libHSblaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHSciteproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScommonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz-ghc9.4.5.so \
libHScommonmark-extensions-0.2.3.4-fvyaRimQueHtxCz9MhD8e-ghc9.4.5.so \
libHScommonmark-pandoc-0.2.1.3-FiR1R9G72Pe54eJfxxlumA-ghc9.4.5.so \
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
libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so \
libHSdoclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0-ghc9.4.5.so \
libHSdoctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny-ghc9.4.5.so \
libHSemojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSgenerically-0.1.1-9IDkuVjdBOA27Mdybf3GBx-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSgridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS-ghc9.4.5.so \
libHShaddock-library-1.11.0-3IU1wl1Mct8946s210c9Hs-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so \
libHShttp-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215-ghc9.4.5.so \
libHShttp-client-tls-0.3.6.1-1pQpHwWyWRWKJTeRlrZZA0-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so \
libHSindexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSiproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd-ghc9.4.5.so \
libHSipynb-0.2-5jt56R8prxRLKDISePbcpi-ghc9.4.5.so \
libHSjira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH-ghc9.4.5.so \
libHSlibyaml-0.1.2-HGo47aMnIYAKZUBwKE0axw-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so \
libHSmono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libHSpandoc-types-1.23-EFziwPO22I72D2SxHphq63-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpem-0.2.4-GVwv4fsQYoEEDbQiUNwxns-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSpretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSresourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv-ghc9.4.5.so \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHSsemialign-1.2.0.1-LDzKW6eKwIG6WFTA9nak5m-ghc9.4.5.so \
libHSsemigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1-ghc9.4.5.so \
libHSskylighting-0.13.2.1-BFihQrd5v8J7nFEx17mOBW-ghc9.4.5.so \
libHSskylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63-ghc9.4.5.so \
libHSskylighting-format-ansi-0.1-37mK2ZS7ued5gd5quPggBj-ghc9.4.5.so \
libHSskylighting-format-blaze-html-0.1.1-GSLRiRB6bjcEjUjplnknYR-ghc9.4.5.so \
libHSskylighting-format-context-0.1.0.2-KUO5o5IaP468SqsY1Sf1SB-ghc9.4.5.so \
libHSskylighting-format-latex-0.1-BfMH5Wq0cc5AFSMLgsgxu-ghc9.4.5.so \
libHSsocks-0.6.1-CAd82jbrmKj2bUx8fkWhGg-ghc9.4.5.so \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStemporary-1.3-9rLWZg49Shk3gKExST32p-ghc9.4.5.so \
libHStexmath-0.12.7.1-7OWYB1fHEsHAa3KAfzQAEj-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStext-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS-ghc9.4.5.so \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHSth-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN-ghc9.4.5.so \
libHSth-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx-ghc9.4.5.so \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so \
libHStls-1.6.0-48osxqPawrs8SblkErmTaM-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHStyped-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO-ghc9.4.5.so \
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
libHSwitherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh-ghc9.4.5.so \
libHSx509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw-ghc9.4.5.so \
libHSx509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt-ghc9.4.5.so \
libHSx509-system-1.6.7-BOgSBhUS7jg4riLu2Dt4H7-ghc9.4.5.so \
libHSx509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO-ghc9.4.5.so \
libHSxml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g-ghc9.4.5.so \
libHSxml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4-ghc9.4.5.so \
libHSxml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb-ghc9.4.5.so \
libHSyaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi-ghc9.4.5.so \
libHSzip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm

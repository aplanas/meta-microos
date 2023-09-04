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

RPM_NAME = "ghc-pandoc-3.1.3-2.10.aarch64.rpm"
RPM_HASH = "2bcc80bed7f1c8ed31e3d9ea5d8d91f028292fe979f1d1347caa263bce47bb6a3863943aeb1ef3d37785b511affc648ef4b9e8a06484991e7217762d496dde83"

RPROVIDES:${PN} += "ghc-pandoc \
libHSpandoc-3.1.3-3qp3YNUvImv4Np7s1jfaFL-xml-light-ghc9.4.6.so \
libHSpandoc-3.1.3-DH3GNUoUN8j8vzRMH3Lho2-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSGlob-0.10.2-96NxBWCYICFFsqKvc9eqpc-ghc9.4.6.so \
libHSJuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508-ghc9.4.6.so \
libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSOnly-0.1-qCrN026ulaL2ZFxnlcrV1-ghc9.4.6.so \
libHSQuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8-ghc9.4.6.so \
libHSSHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSaeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc-ghc9.4.6.so \
libHSaeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk-ghc9.4.6.so \
libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSappar-0.1.8-1lWb1vtDAvc6rz1D87iAo-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
libHSbase-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so \
libHSbase64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSblaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9-ghc9.4.6.so \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHSciteproc-0.8.1-D6MAOBfduqd1r1TVF002aA-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScommonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR-ghc9.4.6.so \
libHScommonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr-ghc9.4.6.so \
libHScommonmark-pandoc-0.2.1.3-GkTisosgOerIgZW4ZPE6QD-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHSconduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX-ghc9.4.6.so \
libHSconduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf-ghc9.4.6.so \
libHSconnection-0.3.1-HritGhbYIMl4OD06E3KY8G-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHScookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdigest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSdoclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc-ghc9.4.6.so \
libHSdoctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7-ghc9.4.6.so \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfile-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSgridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH-ghc9.4.6.so \
libHShaddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShaskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHShttp-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1-ghc9.4.6.so \
libHShttp-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSiproute-1.7.12-A34D1N9dJmL5ps3agDCHa7-ghc9.4.6.so \
libHSipynb-0.2-Ij25To1hTXLCW4aPHIgo1Y-ghc9.4.6.so \
libHSjira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO-ghc9.4.6.so \
libHSlibyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSmime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab-ghc9.4.6.so \
libHSmono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM-ghc9.4.6.so \
libHSpandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSpretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSregex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae-ghc9.4.6.so \
libHSregex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM-ghc9.4.6.so \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so \
libHSsafe-0.3.19-9uHvZjuyLiR13wOGSONZxX-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemialign-1.3-6anmyujTzjW8JKdJGWMlmE-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSskylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy-ghc9.4.6.so \
libHSskylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1-ghc9.4.6.so \
libHSskylighting-format-ansi-0.1-6YWd7hT12ae6ct6gjoY3vc-ghc9.4.6.so \
libHSskylighting-format-blaze-html-0.1.1-IxxFYeMhOngAXP1tckorZR-ghc9.4.6.so \
libHSskylighting-format-context-0.1.0.2-DKquH4NR4zs5BA4tBpnI9m-ghc9.4.6.so \
libHSskylighting-format-latex-0.1-88rCuL9rp0NWp0m2geBsy-ghc9.4.6.so \
libHSsocks-0.6.1-5RVEIbYAf8qJqchdUVHVHw-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstreaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStemporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR-ghc9.4.6.so \
libHStexmath-0.12.8-4XHW2MeUv8XDrGEniW8iCo-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so \
libHSth-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStime-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM-ghc9.4.6.so \
libHStls-1.6.0-D0DtS2mRMN13yCvXOGSBsv-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHStyped-process-0.2.11.0-D02VU1fccqSD0M6BP6Pfz9-ghc9.4.6.so \
libHStypst-0.1.0.0-2jeJx4H6IsHkPaNZ5Ucvx-ghc9.4.6.so \
libHStypst-symbols-0.1.2-3u6ALqSoiYt5j197EL0vRB-ghc9.4.6.so \
libHSunicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ-ghc9.4.6.so \
libHSunicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr-ghc9.4.6.so \
libHSunicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24-ghc9.4.6.so \
libHSuniplate-1.6.13-EEjCQACslljIQmS3K29CqX-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so \
libHSx509-1.7.7-2oKbMm4GXJUL45OKqbcDfn-ghc9.4.6.so \
libHSx509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9-ghc9.4.6.so \
libHSx509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY-ghc9.4.6.so \
libHSx509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4-ghc9.4.6.so \
libHSxml-1.3.14-JgZFWdUND2BGObIBmJlnFJ-ghc9.4.6.so \
libHSxml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9-ghc9.4.6.so \
libHSxml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6-ghc9.4.6.so \
libHSyaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM-ghc9.4.6.so \
libHSzip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm

SUMMARY = "Haskell pandoc library development files"
DESCRIPTION = "This package provides the Haskell pandoc library development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-devel-3.1.3-2.10.aarch64.rpm"
RPM_HASH = "652661a4c9f8e3db2f59e5b4eab3d02562c4c2f80462426a53b0886ccadb315df5d0ac349cc68d8d8bcc367f7578e5a8adac3aa3179eeb6495f782183acf0658"

RPROVIDES:${PN} += "ghc-devel-pandoc-3.1.3-DH3GNUoUN8j8vzRMH3Lho2 \
ghc-pandoc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-devel-JuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508 \
ghc-devel-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S \
ghc-devel-binary-0.8.9.1 \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-citeproc-0.8.1-D6MAOBfduqd1r1TVF002aA \
ghc-devel-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-devel-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr \
ghc-devel-commonmark-pandoc-0.2.1.3-GkTisosgOerIgZW4ZPE6QD \
ghc-devel-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-devel-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-devel-exceptions-0.10.5 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-gridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH \
ghc-devel-haddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp \
ghc-devel-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-ipynb-0.2-Ij25To1hTXLCW4aPHIgo1Y \
ghc-devel-jira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO \
ghc-devel-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-pretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K \
ghc-devel-process-1.6.17.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-skylighting-0.13.4.1-3SOo9dVatPFFF0udKykjgy \
ghc-devel-skylighting-core-0.13.4.1-Hz9bNgtQKIrCLRLiqtSBj1 \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-devel-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-devel-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-devel-texmath-0.12.8-4XHW2MeUv8XDrGEniW8iCo \
ghc-devel-text-2.0.2 \
ghc-devel-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-devel-time-1.12.2 \
ghc-devel-typst-0.1.0.0-2jeJx4H6IsHkPaNZ5Ucvx \
ghc-devel-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-devel-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24 \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-devel-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-devel-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K \
ghc-devel-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj \
ghc-pandoc"

inherit rpm

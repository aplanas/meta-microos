SUMMARY = "Haskell pandoc profiling library"
DESCRIPTION = "This package provides the Haskell pandoc profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-prof-3.1.3-2.11.aarch64.rpm"
RPM_HASH = "2763eeafbc3d475500a9f078b2c6301c4f01fe9dbc69fca451fce49c8ab38eaa6e0394f8efd19cef02a79616571dc09279d85501565831c1b4766851de6fe2d5"

RPROVIDES:${PN} += "ghc-pandoc-prof \
ghc-prof-pandoc-3.1.3-7SpHdPApqTYJphV8bknLiB-xml-light \
ghc-prof-pandoc-3.1.3-vrz2YBr4KqIJ1o9bFBvzp"

RDEPENDS:${PN} += "ghc-pandoc-devel \
ghc-prof-Glob-0.10.2-96NxBWCYICFFsqKvc9eqpc \
ghc-prof-JuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508 \
ghc-prof-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-aeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-0.4.2.4-9NczX8l4v8MH7Wgvf1jp8S \
ghc-prof-binary-0.8.9.1 \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-citeproc-0.8.1-2pX9OkWyX7lDXHT1UDpuWJ \
ghc-prof-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-prof-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr \
ghc-prof-commonmark-pandoc-0.2.1.3-GkTisosgOerIgZW4ZPE6QD \
ghc-prof-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-prof-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-prof-exceptions-0.10.5 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-gridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH \
ghc-prof-haddock-library-1.11.0-GgwR20uLBzH14FvpuxBHjp \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-prof-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-ipynb-0.2-Ij25To1hTXLCW4aPHIgo1Y \
ghc-prof-jira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO \
ghc-prof-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-pretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K \
ghc-prof-process-1.6.17.0 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-skylighting-0.13.4.1-154hDBm9lstJ5eMNDkHcA5 \
ghc-prof-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-prof-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-prof-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-prof-texmath-0.12.8.1-3LxXxmLvAtyApeIh6UJCwI \
ghc-prof-text-2.0.2 \
ghc-prof-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-prof-time-1.12.2 \
ghc-prof-typst-0.1.0.0-Fmp2IG7sNnSDScnnN1f3Kg \
ghc-prof-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-prof-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24 \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-prof-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-prof-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K \
ghc-prof-zlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj"

inherit rpm

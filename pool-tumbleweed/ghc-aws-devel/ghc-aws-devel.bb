SUMMARY = "Haskell aws library development files"
DESCRIPTION = "This package provides the Haskell aws library development files."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-devel-0.23-1.11.aarch64.rpm"
RPM_HASH = "91098fd92e5fd0e898f59d75d7f95190099189b0ab4d7649a2f56c69d328e782696ef27888334a3435b46e7ae0d45213948ae9de48ab45e262d53f9577326468"

RPROVIDES:${PN} += "ghc-aws-devel \
ghc-devel-aws-0.23-KtW1Qdv58Ot78FTxKP1DMo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aws \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
ghc-devel-http-conduit-2.3.8.2-JL53aegdUXo82DAJNh0Sqj \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-lifted-base-0.2.3.12-8AMs8PuCeaLKJwoieZv4GI \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-monad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-bsd-2.8.1.0-6HwBWPM2Dri1VSrR1y6aDh \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9"

inherit rpm

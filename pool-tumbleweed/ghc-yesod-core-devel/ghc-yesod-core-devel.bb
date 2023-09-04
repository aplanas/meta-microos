SUMMARY = "Haskell yesod-core library development files"
DESCRIPTION = "This package provides the Haskell yesod-core library development files."
LICENSE = "MIT"

PV = "1.6.24.4"

RPM_NAME = "ghc-yesod-core-devel-1.6.24.4-1.6.aarch64.rpm"
RPM_HASH = "32b423f3ae784405d32bdcb05cab863f97bba4460e4cf4546f87238e0452ba4955d57fb8cbc84db4132bd8862ce598f87c635c9aa192666f62c8b7f9abdf0d0d"

RPROVIDES:${PN} += "ghc-devel-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-clientsession-0.9.2.0-KWpEVRfIrcVFYLxAWzOYnt \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-devel-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-devel-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-yesod-core"

inherit rpm

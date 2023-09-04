SUMMARY = "Haskell yesod-core profiling library"
DESCRIPTION = "This package provides the Haskell yesod-core profiling library."
LICENSE = "MIT"

PV = "1.6.24.4"

RPM_NAME = "ghc-yesod-core-prof-1.6.24.4-1.6.aarch64.rpm"
RPM_HASH = "0a44bdd498da977d9e0263789d8659e4381758c5fba2c38f4090a669a5252a52c14e52f0edb0a49bbf1a11db16022225232cbe511c38fa6af14f3a28af41d992"

RPROVIDES:${PN} += "ghc-prof-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-prof-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-clientsession-0.9.2.0-KWpEVRfIrcVFYLxAWzOYnt \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-conduit-extra-1.3.6-370xQw6Laeb4Jkz5zTLBuf \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-wai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF \
ghc-prof-wai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs \
ghc-prof-warp-3.3.25-9kawobphGNJ1pZTKG2KRtq \
ghc-prof-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-yesod-core-devel"

inherit rpm

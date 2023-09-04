SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-devel-3.5-1.16.aarch64.rpm"
RPM_HASH = "554d4a33848a7e5dcd35eebb9e0e0eed7bde5751d249decd85ecc73ce1f9c3cacbf8977d89549f844cc5798ac32593451e3f86424aa073bd7b59ac6bd636e8ce"

RPROVIDES:${PN} += "ghc-devel-hlint-3.5-DZkqPPxDiE9BpYCGyCIup3 \
ghc-hlint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-devel-containers-0.6.7 \
ghc-devel-cpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-deriving-aeson-0.2.9-7GG7RbiGvWZJpJcDU5qu5W \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-filepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde \
ghc-devel-ghc-lib-parser-9.4.6.20230808-BTkqGaXXohb8duAYJJlTmh \
ghc-devel-ghc-lib-parser-ex-9.4.0.0-FnsACeicRjR9lrHyF5i7Lw \
ghc-devel-hscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w \
ghc-devel-process-1.6.17.0 \
ghc-devel-refact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-hlint"

inherit rpm

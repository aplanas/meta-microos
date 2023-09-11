SUMMARY = "Haskell hlint library development files"
DESCRIPTION = "This package provides the Haskell hlint library development files."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-devel-3.5-1.17.aarch64.rpm"
RPM_HASH = "b5832b2765f3aec0d691c27851e957ea89233fc49e9cb2a7b76a13b2040523b2363c2eeb60eaf736ded8488f7b5ad46f656ede7458058b9dbd16d1c1144ccb27"

RPROVIDES:${PN} += "ghc-devel-hlint-3.5-4RmFhbheUGCL3K3OzJi0Yw \
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
ghc-devel-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU \
ghc-devel-ghc-lib-parser-ex-9.4.0.0-5gI0mYE7T3L4MUgurM5BvD \
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

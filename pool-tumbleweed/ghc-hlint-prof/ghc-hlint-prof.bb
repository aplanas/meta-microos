SUMMARY = "Haskell hlint profiling library"
DESCRIPTION = "This package provides the Haskell hlint profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-prof-3.5-1.17.aarch64.rpm"
RPM_HASH = "a355c21da2066897f14be4d37a391da25cc0a6b0791e9a90e092f60b51aeb28bf7bc72bda312e7b866864eac5a399dd6cdf48427e9802d521df34a66b19e5b5e"

RPROVIDES:${PN} += "ghc-hlint-prof \
ghc-prof-hlint-3.5-4RmFhbheUGCL3K3OzJi0Yw"

RDEPENDS:${PN} += "ghc-hlint-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx \
ghc-prof-containers-0.6.7 \
ghc-prof-cpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-deriving-aeson-0.2.9-7GG7RbiGvWZJpJcDU5qu5W \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-filepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde \
ghc-prof-ghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU \
ghc-prof-ghc-lib-parser-ex-9.4.0.0-5gI0mYE7T3L4MUgurM5BvD \
ghc-prof-hscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w \
ghc-prof-process-1.6.17.0 \
ghc-prof-refact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM"

inherit rpm

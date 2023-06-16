SUMMARY = "Haskell statistics library development files"
DESCRIPTION = "This package provides the Haskell statistics library development files."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-devel-0.16.2.0-1.3.aarch64.rpm"
RPM_HASH = "58c30067b77fc4bc56e58397af804525c8870d93d9189f512097c12481b9fdddc506f0973d7f3bec1364c144cd276e6c7575a33dadb8dbc1ec23c3b1d550c948"

RPROVIDES:${PN} += "ghc-devel-statistics-0.16.2.0-LfIwroNJuQDMt3pStkU86 \
ghc-statistics-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-dense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn \
ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-devel-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-devel-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-devel-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-devel-vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t \
ghc-statistics"

inherit rpm

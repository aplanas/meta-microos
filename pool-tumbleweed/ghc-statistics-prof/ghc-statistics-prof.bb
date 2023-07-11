SUMMARY = "Haskell statistics profiling library"
DESCRIPTION = "This package provides the Haskell statistics profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-prof-0.16.2.0-1.6.aarch64.rpm"
RPM_HASH = "6069bba1f58fdb64150e0e83079c56674f6b8e380db7af2b6236c99307e7efeabf07968ce5341403b17660d7664af6a9bb17f8dcbfd6de4bd7f28834e298819d"

RPROVIDES:${PN} += "ghc-prof-statistics-0.16.2.0-KAkoTXt1eFLCqUuIxaQQe3 \
ghc-statistics-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-dense-linear-algebra-0.1.0.0-2PBc2PrDutT32RQREBxCzn \
ghc-prof-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-prof-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-prof-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-prof-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-prof-vector-th-unbox-0.2.2-8WH0ofCzoXcG1eDIxYKY6t \
ghc-statistics-devel"

inherit rpm

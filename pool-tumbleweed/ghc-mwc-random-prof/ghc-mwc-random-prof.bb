SUMMARY = "Haskell mwc-random profiling library"
DESCRIPTION = "This package provides the Haskell mwc-random profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-prof-0.15.0.2-3.6.aarch64.rpm"
RPM_HASH = "fcad09ca644b64098d4c0ebfa327799af6f2d21ffac118d2341d27d49da483354a5a7c6a2ba833744749a309cc83d78900c48a86dfe0ba8f31c4d1a93e3550e5"

RPROVIDES:${PN} += "ghc-mwc-random-prof \
ghc-prof-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP"

RDEPENDS:${PN} += "ghc-mwc-random-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-time-1.12.2 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm

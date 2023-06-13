SUMMARY = "Haskell mwc-random profiling library"
DESCRIPTION = "This package provides the Haskell mwc-random profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-prof-0.15.0.2-3.3.aarch64.rpm"
RPM_HASH = "ce2d98c2ececa425a4e3bb60c04c4313096caaaea588ac8cfd4df536a486aeb1fe0af0b4549e0c44adfb9456d86767d0bfc9f250ba2af8dd19e402aa6d782df0"

RPROVIDES:${PN} += "ghc-mwc-random-prof \
ghc-mwc-random-prof(aarch-64) \
ghc-prof(mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP)"

RDEPENDS:${PN} += "ghc-mwc-random-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk) \
ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-prof(time-1.12.2) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm

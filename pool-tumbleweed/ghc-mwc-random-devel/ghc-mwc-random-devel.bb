SUMMARY = "Haskell mwc-random library development files"
DESCRIPTION = "This package provides the Haskell mwc-random library development files."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-devel-0.15.0.2-3.3.aarch64.rpm"
RPM_HASH = "6a388c80699876e3e034b8a3ac1be6e5c246829a9db4418ef9a7fcc41ad3df9d68d7754b76e17a4fbaf5c961f91eb1b6d90330866efb32c3d5d579e4830a4609"

RPROVIDES:${PN} += "ghc-devel(mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP) \
ghc-mwc-random-devel \
ghc-mwc-random-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk) \
ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(time-1.12.2) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-mwc-random"

inherit rpm

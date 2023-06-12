SUMMARY = "Haskell math-functions profiling library"
DESCRIPTION = "This package provides the Haskell math-functions profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-prof-0.3.4.2-2.3.aarch64.rpm"
RPM_HASH = "5aaeb7e6920df725039299f63ea3dc7715e0b90be292c1c64281a67a9073ffc9a7d37853fdc2a546b5e708547adafe50855bc2cdc42dfc427f247827bd5d54de"

RPROVIDES:${PN} += "ghc-math-functions-prof \
ghc-math-functions-prof(aarch-64) \
ghc-prof(math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk)"
RDEPENDS:${PN} += "ghc-math-functions-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm

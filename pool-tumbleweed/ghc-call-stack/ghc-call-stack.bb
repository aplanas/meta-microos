SUMMARY = "Use GHC call-stacks in a backward compatible way"
DESCRIPTION = "Use GHC call-stacks in a backward compatible way."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-0.4.0-2.8.aarch64.rpm"
RPM_HASH = "79ff84a69f3e8a3faabfe9057785348af5e10c055d0d1bd78d7ac9649c8f36776ac646fd81e97a3372a2c458379edf827534df15a0fc7e65577853d4f55fbb7c"

RPROVIDES:${PN} += "ghc-call-stack \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

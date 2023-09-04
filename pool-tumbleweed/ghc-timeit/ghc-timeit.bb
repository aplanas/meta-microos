SUMMARY = "Time monadic computations with an IO base"
DESCRIPTION = "A simple wrapper to show the used CPU time of monadic computation with an IO \
base."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-2.0-6.3.aarch64.rpm"
RPM_HASH = "d099077b9a453eaf46aa5a681d5dd3f0117c76313c5ac89c4e8706ed41d9132f73bb6d0d37ff2ce2ee16227a1d357871215ce797b7c93a4e5fffb94e3c275480"

RPROVIDES:${PN} += "ghc-timeit \
libHStimeit-2.0-4alyyqlO7m4DFFkjYuUzq9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

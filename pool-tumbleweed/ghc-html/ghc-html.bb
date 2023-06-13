SUMMARY = "HTML combinator library"
DESCRIPTION = "This package contains a combinator library for constructing HTML documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-1.0.1.2-4.2.aarch64.rpm"
RPM_HASH = "7788bef25d9aa563f5b6676d16a59d7937138725ab9c01204faa4ba5a8acbb7c5d08d1636fa963f7ab960b90b5e82700a9c1f31287bdf8d6dc4c45bd78946ef6"

RPROVIDES:${PN} += "ghc-html \
ghc-html(aarch-64) \
libHShtml-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm

SUMMARY = "A library for word-wrapping"
DESCRIPTION = "A library for wrapping long lines of text."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-0.5-2.2.aarch64.rpm"
RPM_HASH = "dc01c8e8ff5c21d3a1cf4c2882e9c91ad9feeb64f0ccca5f78f19245a934ff531e21595c530eb792e68da29020111606f8a0bd08276b2da4182800ae12f77ff0"

RPROVIDES:${PN} += "ghc-word-wrap \
libHSword-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
